package com.DeepCopy;

public class Dog implements Cloneable{
	
	Cat c;
	int i;
	Dog(Cat c, int i){
		this.c = c;
		this.i = i;
	}
	
	public Object clone()throws CloneNotSupportedException{
		//return super.clone();
		Cat c1 = new Cat(c.j);
		Dog d2 = new Dog(c1,i);
		return d2;
	}

}
