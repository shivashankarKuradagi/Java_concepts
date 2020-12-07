package com.shiv.thread;

public class StaticSynchronizedExchange {
	
	static Object obj = null;

	public static synchronized Object getObject() {
		return obj;
	}

	public static synchronized void setObject(Object obj) {
		obj = obj;
	}
	
	
	public static Object getObj() {
		synchronized (StaticSynchronizedExchange.class) {
			return obj;
		}
	}

	public static void setOb(Object obj) {
		synchronized (StaticSynchronizedExchange.class) {
			obj = obj;			
		}
	}
	
	
	
	

}
