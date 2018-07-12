package com.DeepCopy;

public class Test0 implements Cloneable{

	public static void main(String[] args){
		
		try{
			Cat c = new Cat(20);
		
			Dog d1 = new Dog(c,10);
			
			//without cloning
			System.out.println("Before Cloning: i= "+d1.i+" j= "+d1.c.j);
			//cloning
			Dog d2 = (Dog)d1.clone();
			d2.i = 888;
			d2.c.j = 999;
			
			System.out.println("After Cloning: i= "+d2.i+" j="+d2.c.j);
		
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
	}
}
