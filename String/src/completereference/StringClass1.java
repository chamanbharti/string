package completereference;
//Construct one string from another
public class StringClass1 {
	public static void main(String[] args) {
		char c[] = {'J','a','v','a'};
		String s1 = new String(c);
		System.out.println(s1);
		String s2 = new String(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);//false
		
	}

}
