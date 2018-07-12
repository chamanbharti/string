package completereference;

import java.io.UnsupportedEncodingException;

public class MixedMethodDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//charAt()
		char ch;
		ch = "abc".charAt(1);
		System.out.println(ch);
		String name="Chaman Bharti";
		char chh=name.charAt(5);//returns the char value at the 5th index  
		System.out.println(chh);
		
		//getChars()
		String s = "This is a demo of the getChars method.";
		int start = 10;
		int end = 14;
		char buf[] = new char[end - start];
		s.getChars(start, end, buf, 0);
		System.out.println("getChars()");
		System.out.println(buf);
		
		//getBytes()
		String gb="ABCDEFG";
		byte[] barr=gb.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);
		}
		//toCharArray()
		System.out.println("toCharArray()");
		char[]charray=gb.toCharArray();
		for (int i = 0; i < charray.length; i++) {
			System.out.print(charray[i]);
		}
		System.out.println();
		//valueOf()
		System.out.println("valueOf()");
		int value=30;
		String s1 = String.valueOf(value);
		System.out.println(s1+10);
		double d=30;
		String dd = String.valueOf(d);
		System.out.println(dd+10);
	}

}
