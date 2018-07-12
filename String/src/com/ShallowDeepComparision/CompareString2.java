package com.ShallowDeepComparision;
class CompareString2{
public static void main(String args[])
{
	 String s1="Sachin";  
	 String s2="SACHIN";  
	 String s3="Sachin";
	  
	   System.out.println(s1.equals(s2));//false 
	   System.out.println(s1==s2);//true
	   System.out.println(s1.equalsIgnoreCase(s2));//true  
	   System.out.println(s1.hashCode());
	   System.out.println(s2.hashCode());
	   System.out.println(s3.hashCode());
	   System.out.println(s1==s3);
	   System.out.println(s1.equals(s3));
}

}