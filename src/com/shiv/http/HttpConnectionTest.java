package com.shiv.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class HttpConnectionTest {

	public static void main(String[] args) {
		
		try {
			Map<String, Double> holdingMap  = getHoldingValueMap();
			
			if (holdingMap == null) {
			
			}
			
			Map<String, Double> pricingMap  = getPricingMap();
			
			if (pricingMap == null) {
				
			}
			
			double  price = 0.0;
			
			for (Entry<String, Double> set : holdingMap.entrySet()) {
				price += pricingMap.get(set.getKey()) == null ? 0 : pricingMap.get(set.getKey()) * set.getValue();
				
			}
			
			System.out.println("price : " + price);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error while calculateNAV ");
		}
		
	}

	private static Map<String, Double> getPricingMap() throws Exception {
		Map<String, Double> map = null;
			URL url = new URL("https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/api/pricing");
			String readLine = null;
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.addRequestProperty("Method", "GET");
			int code = con.getResponseCode();
			
			if (code == HttpURLConnection.HTTP_OK) {
				
				BufferedReader in  = new BufferedReader(new InputStreamReader(con.getInputStream()));
				StringBuffer response = new StringBuffer();
				
				while((readLine = in.readLine()) != null) {
					//System.out.println(readLine);
					response.append(readLine);
				}

				
				System.out.println(response.toString());

				JsonObject[] strObj = new Gson().fromJson(response.toString(), JsonObject[].class);
				map = new HashMap<String, Double>();
				for (JsonObject jsonObject : strObj) {
					if(jsonObject.get("date").getAsString().equals("20190331")) {
						//jsonObject.get("date").getAsDouble();
						
						map.put(jsonObject.get("security").getAsString(), jsonObject.get("price").getAsDouble());
					}
				}
			}
			return map;
	}

	private static Map<String, Double> getHoldingValueMap() throws Exception  {    	
		Map<String, Double> map = null;
			URL url = new URL("https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/api/holding");
			String readLine = null;
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.addRequestProperty("Method", "GET");
			int code = con.getResponseCode();
			
			if (code == HttpURLConnection.HTTP_OK) {
				
				BufferedReader in  = new BufferedReader(new InputStreamReader(con.getInputStream()));
				StringBuffer response = new StringBuffer();
				
				while((readLine = in.readLine()) != null) {
					//System.out.println(readLine);
					response.append(readLine);
				}
				map =new HashMap<String, Double>();
				JsonObject[] strObj = new Gson().fromJson(response.toString(), JsonObject[].class);
				for (JsonObject jsonObject : strObj) {
					if(jsonObject.get("date").getAsString().equals("20190331")) {
						//jsonObject.get("date").getAsDouble();
						if (map.containsKey(jsonObject.get("security").getAsString())) {
							double temp = map.get(jsonObject.get("security").getAsString()) + jsonObject.get("quantity").getAsDouble();
							map.put(jsonObject.get("security").getAsString(), temp );
						} else {

							map.put(jsonObject.get("security").getAsString(), jsonObject.get("quantity").getAsDouble());
						}
						
					}
				}
			}
			
			return map;
	}

}
