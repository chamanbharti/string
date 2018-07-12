package immutableStringClass;
/*
 * static blank final variable
 * a static blank final variable that is not initialized at the time of declaration is known as static blank final variable.
 * it can be initialize only in static block.
 */
public class StaticBlankFinal {
	
	static final int data;//static blank final variable
	static{
		data=50;
	}
	public static void main(String[] args) {
		System.out.println(data);
	}

}
