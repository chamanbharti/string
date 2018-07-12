package immutableStringClass;
/*
 * What is final parameter
 * If you declare any parameter as final, you cann't change the value of it
 * Can we declare a constructor final?
 * No, because constructor is never inherited
 */
public class FinalParameter {
	int cube(final int n){
		n=n+2;//can't be changed as n final
		n*n*n;
	}
	public static void main(String[] args) {
		FinalParameter obj=new FinalParameter();
		obj.cube(5);
	}

}
