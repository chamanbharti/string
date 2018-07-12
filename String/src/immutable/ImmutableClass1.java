package immutable;

public final class ImmutableClass1 {

	private final int a;
	private final int b;
	
	ImmutableClass1(final int a,final int b){
		this.a=a;
		this.b=b;
	}
	
	public int getA(){
		return a;
	}
	
	public int getB(){
		return b;
	}
	
	public static void main(String[] args) {
		ImmutableClass1 i = new ImmutableClass1(10,20);
		System.out.println("a="+i.getA());
		System.out.println("b="+i.getB());
		
		tryModification(i.getA(), i.getB());
		System.out.println("a="+i.getA());
		System.out.println("b="+i.getB());
	}
	
	@SuppressWarnings("unused")
	private static void tryModification(int a,int b){
		a=20;
		b=30;
	}
}
