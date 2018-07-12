class EqualsIgnoreCaseMethod
{
	public static void main(String[] args)
	{
		String s1="Sachin";
		String s2="SACHIN";
		String s3="SACHIN";

		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s3));//true
		
	}
}