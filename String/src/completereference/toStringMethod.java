package completereference;

public class toStringMethod {
	public static void main(String[] args) {
		Box b = new Box(10, 12, 14);
		String s = "Box b: "+b;//concatenate box object
		System.out.println(b);//convert box to string
		System.out.println(s);
		
	}

}
