package immutable;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClass3 {

	private final int id;
	private final String name;
	private final HashMap<String, String>testMap;
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	//accessor function for mutable objects
	@SuppressWarnings("unchecked")
	public HashMap<String,String> getTestMap(){
		return testMap;//for shallow copy
		//return (HashMap<String,String>)testMap.clone();//for deep copy
	}
	/**
	 * Constructor performing Deep Copy
	 * @param i
	 * @param n
	 * @param hm
	 */
	/*public ImmutableClass3(int i,String n,HashMap<String,String> hm){
		System.out.println("Performing Deep Copy for Object initialization");
		this.id=i;
		this.name=n;
		HashMap<String, String> tempMap = new HashMap<String,String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()){
			key = it.next();
			tempMap.put(key, hm.get(key));
		}
		
		this.testMap=tempMap;
	}*/
	
	/**
	 * Constructor performing Shallow Copy
	 * @param i
	 * @param n
	 * @param hm
	 */
	
	public ImmutableClass3(int i,String n,HashMap<String,String> hm){
		System.out.println("Performing Shallow Copy for Object initialization");
		this.id=i;
		this.name=n;
		this.testMap=hm;
		
	}
	/**
	 * To test the consequences of Shallow Copy and how to avoid it with Deep Copy for creating immutable classes
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		HashMap<String, String> h1 = new HashMap<>();
		h1.put("1", "first");
		h1.put("2", "second");
		
		String s = "original";
		
		int i = 10;
		
		ImmutableClass3 obj = new ImmutableClass3(i, s, h1);
		
		//Lets see whether its copy by field or reference
		System.out.println(s==obj.getName());
		System.out.println(h1 ==obj.getTestMap());
		//print the ce values
		System.out.println("obj id:"+obj.getId());
		System.out.println("obj name:"+obj.getName());
		System.out.println("obj testMap:"+obj.getTestMap());
		//change the local variable values
		i=20;
		s="modified";
		h1.put("3", "third");
		//print the values again
		System.out.println("After changed the local variable values");
		System.out.println("obj id :"+obj.getId());
		System.out.println("obj name :"+obj.getName());
		System.out.println("obj testMap :"+obj.getTestMap());
		HashMap<String, String> hmTest = obj.getTestMap();
		hmTest.put("4", "new");
		
		System.out.println("obj testMap :"+obj.getTestMap());
		
	}
}
