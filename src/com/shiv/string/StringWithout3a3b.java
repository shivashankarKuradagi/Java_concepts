package com.shiv.string;

public class StringWithout3a3b {

	public static void main(String[] args) {

		System.out.println(strWithout3a3b(1, 4));

	}
	

    public static String strWithout3a3b(int a, int b) {
        
        StringBuilder out = new StringBuilder();
         
            int acount=0;
            int bcount=0;
        
        while(a != 0 || b != 0){
            int temp  = 0;
            if ( acount < 2){
                temp =a-b;
                if(temp > 1){
                    out.append("aa");
                    a = a-2;
                    acount = 2;
                    bcount=0;
                }else {
                    out.append("a");
                    a = a-1;
                    acount = 1;
                    bcount=0;
                } 
            } else if ( bcount < 2) {
                temp = b-a;
                if(temp > 1){
                    out.append("bb");
                    b = b-2;
                    bcount=2;
                    acount =0;
                }else {
                    out.append("b");
                    b = b-1;
                    bcount=1;
                    acount =0;
                } 
            } else {
            	System.out.println("invalid count");
            	return null;
            }
            
        }
        if (a > 2 || b > 2 ){
            return null;
        }
        if (a == 0 || a == 0 ){
            return out.toString();
        }
        if (a >= 2) {
        	out.append("aa");
		} else {
			out.append("a");
		}
        if (b >= 2) {
        	out.append("bb");
		} else {
			out.append("b");
		}
    return out.toString();        
    }

}
