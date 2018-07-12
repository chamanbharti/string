package completereference;

public class StringConcatenation {
	public static void main(String[] args) {
		String age = "9";
		String s = "He is " + age + " years old.";
		System.out.println(s);//He is 9 years old.
		
		//// Using concatenation to prevent long lines.
		String longStr = "This could have been"+"a very long line that would have"+
		" wrapped around. But String concatenation "+"prevents this.";
		System.out.println(longStr);
		
		int age2 = 9;
		String s2 = "He is " + age + " years old.";
		System.out.println(s2);//He is 9 years old.
		
		//suprising display
		String s3 = "four: "+ 2 + 2;
		System.out.println(s3);//four: 22
		String s4 = "four: "+ (2 + 2);
		System.out.println(s4);//four: 4
	}

}
