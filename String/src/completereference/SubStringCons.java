package completereference;

//Construct string from subset of char array.
public class SubStringCons {
	public static void main(String[] args) {
		
		byte ascii[] = {65,66,67,68,69,70};
		
		String s1 = new String(ascii);
		System.out.println(s1);
		String s2 = new String(ascii,2,3);
		System.out.println(s2);
		System.out.println("Length of s1 "+s1.length());
		//string literal
		String s3 = "abcdef";
		System.out.println(s3);
		System.out.println(s1.equals(s3));//false
		System.out.println(s1 == s3);//false
		String s4 = "abcdef";
		String s5 = "abcdef";
		String s6 = new String("abcdef");
		System.out.println(s4.equals(s5));//true
		System.out.println(s4 == s5);//true
		System.out.println(s4.equals(s6));//true
		System.out.println(s4 == s6);//false
	}

}
