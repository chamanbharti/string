
public class getCharsDemo 
{
	public static void main(String[] args) 
	{
	
		String s="This is a demo of getChars method.";
		char ss=s.charAt(1);
		int start=10;
		int end=14;
		char buf[]=new char[end - start];
		s.getChars(start, end, buf, 0);
		System.out.println(buf);
		System.out.println(ss);
	}

}
