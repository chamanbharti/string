package com.ShallowDeepCopy;

public class Test0 implements Cloneable{

	int i = 10;
	int j = 20;
	public static void main(String[] args) throws CloneNotSupportedException{
		Test0 t1 = new Test0();
		//Test0 t2 = t1;
		Test0 t2 = (Test0)t1.clone();
		t2.i = 888;
		t2.j = 999;
		
		System.out.println("i= "+t1.i+" j= "+t1.j);
		System.out.println("i= "+t2.i+" j="+t2.j);
		
	}
}
