class EqualsMethod
{
	public static void main(String[] args)
	{
		String s1="Sachin";
		String s2="Sachin";
		String s3=new String("Sachin");
		String s4="Chaman";

		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s3));//true
		System.out.println(s2==s3);//true
		System.out.println(s1.equals(s4));//false
	}
}