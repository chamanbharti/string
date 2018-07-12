package immutableStringClass;

public class ImmutableClass {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("A4B6U9P5");
		System.out.println("1st Pan Card Number "+e1);//A4B6U9P5
		Employee e2 = new Employee("A5B7U10P6");
		//e1=e2;
		System.out.println("2nd Pan Card Number "+e1);//A5B7U10P6
	}

}
