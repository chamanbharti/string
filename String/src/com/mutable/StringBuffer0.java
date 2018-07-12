package com.mutable;

public class StringBuffer0 {
	public static void main(String[] args) {
		String s=new String("Chaman");
		s.concat("Bharti");
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("Chaman");
		sb.append(" Bharti");//now original string is changed
		System.out.println(sb);//prints Hello Java
	}

}
