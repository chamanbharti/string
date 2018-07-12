package com.basics;

public class Test0 {
	public static void main(String[] args) {
		String str = "abc";
		//equivalent to
		char data[] = {'a','b','c'};
		String str2 = new String(data);
		System.out.println(str+str2);
		
		System.out.println("abc");
		String cde = "cdexvf";
		System.out.println("abc"+cde);
		String c = "abc".substring(2, 3);
		System.out.println(c);
		String d = cde.substring(1, 2);
		System.out.println(d);
		System.out.println(d.codePointCount(1,2));
		System.out.println();
	}

}
