package com.mutable;

public class StringBuffer1 {
	
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello StringBuffer");  
		sb.delete(1,3);  
		System.out.println(sb);//prints Hlo  
		}  

}
