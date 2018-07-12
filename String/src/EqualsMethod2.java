class EqualsMethod2
{
	public static void main(String[] args)
	{
		String s1="Sachin";
		String s2="Sachin";
		String s3=new String("Sachin");
		String s4="Chaman";
		//equals method
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		
		//equals operator
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//false
		System.out.println(s1==s4);//false
	}
}