package immutableStringClass;

public final class Employee {
	final String pancardNumber;//blank final field

	public Employee(String pancardNumber) {
		//super();
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

	@Override
	public String toString() {
		//return "Employee [pancardNumber=" + pancardNumber + "]";
		return pancardNumber;
	}
	
}
