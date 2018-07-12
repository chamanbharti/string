package immutableStringClass;
/*
 * Q) What is blank or uninitialized final variable?
A final variable that is not initialized at the time of declaration is known as blank final variable.
If you want to create a variable that is initialized at the time of creating object and 
once initialized may not be changed, it is useful. For example PAN CARD number of an employee.
It can be initialized only in constructor.
 */
public class BlankFinal {
	final int speedlimit;//blank final variable
	
	public BlankFinal() {
		speedlimit=90;
		System.out.println(speedlimit);
	}
	/*void run(){  
		  speedlimit=400; 
		  System.out.println(speedlimit);
		 } */
	public static void main(String[] args) {
		BlankFinal obj=new BlankFinal();
		//new BlankFinal();
		
	}

}
