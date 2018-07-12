package com.ShallowDeepComparision;
class CompareString4{
public static void main(String args[])
{
	   String s1="Sachin";  
	   String s2="Sachin";  
	   String s3=new String("Sachin");  
	   System.out.println(s1==s2);//true (because both refer to same instance) 
	   System.out.println(s1.equals(s2));//true because content are same
	   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool) 
	   System.out.println(s1.equals(s3));//true because content are same
	   System.out.println(s1.hashCode());
	   System.out.println(s2.hashCode());
	   System.out.println(s3.hashCode());
	   System.out.println(s1==s2);//true
	   System.out.println(s2==s3);//false
	   System.out.println(s2.equals(s3));//true
}

}