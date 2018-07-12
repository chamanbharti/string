package immutableStringClass;
/*Here on this page we will learn how to create immutable class in java with example. 
 * A class whose object once created cannot be modified is called immutable class. Immutable objects are useful 
 * in concurrent applications. Threads cannot corrupt the immutable objects as it cannot be modified. 
 * So immutable objects are thread-safe.
 While creating immutable class, we need to take care that there should be no loop hole to modify our class. 
 We can adopt the following steps while creating immutable objects. 

Step 1: The fields must be final and private. Hence the fields cannot be accessed outside and in subclass because 
it is private and it cannot be changed within the class too because it is private. 

Step 2: Do not provide setter methods. We must not provide setter methods to keep our class immutable. 

Step 3: Do not allow sub class to override methods. If subclass overrides methods, the immutable class can be changed. 
We can avoid it by two options. 
Option-1: Use final keyword at class level. It will not allow the class to be overridden. 
Option-2: Create private constructor and create instances using factory methods. 

Step-4: If our class contains mutable object as instance fields, we need to take care two points. 
a.	Do not provide any method that modifies the mutable objects. 
b.	Do not share references to mutable objects. If we share references to mutable objects, our object can be changed. 
What we can do is we can keep copy of mutable objects.*/
/*Difference between Immutable Object and singleton

1.	There can be more than one object of immutable class but singleton class has only one object. 
	The immutable object once created, cannot be modified. 
2.	Immutable object cannot be changed once created whereas singleton can be modified. 
	Singleton can be mutable but rarely mutable singleton is used.
*/
public final class Student {
	/*final private  String name;
	final private int age;
	
	public Student(final String name, final int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}*/
	/*This above class uses final keyword that will avoid creating subclasses. 
	Now find another approach to create immutable class.*/
	final private String name;
	final private int age;
	private Student(final String name, final int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public static Student getInstance(final int age,final String name){
		return new Student(name,age);
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	/*Here we have created private constructor and a factory method that will create its instance. So using subclasses of it 
	we cannot instantiate this class.*/
	

}
