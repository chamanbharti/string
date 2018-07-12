package com.basics;

public class Test1 {
	public static void main(String[] args) {
		
		String s1 = "Java Technocracy";
		String s2 = "Java Technocracy";

		System.out.println( s1 == s2 );//true
		System.out.println( s1.equals(s2) );//true
		System.out.println( s1.hashCode() == s2.hashCode() );//true
		
		String s3 = "0-42L";
		String s4 = "0-43-";
		
		System.out.println( s3 == s4 );//false
		System.out.println( s3.equals(s4) );//false
		System.out.println( s3.hashCode() == s4.hashCode() );//true
	}

}
