class EqualsMethod0
{
	public static void main(String[] args)
	{
		String s1=new String("Chaman");
		String s2=new String("Chaman");
		
		String s3="Bharti";
		String s4="Bharti";
		
		String s5="Chaman Bharti";
		String s6=new String("Chaman Bharti");
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s3==s4);//true
		System.out.println(s3.equals(s4));//true
		
		System.out.println(s5==s6);//false
		System.out.println(s5.equals(s6));//true
		
	}
}