package com.srnaik.inheritance;

public class B extends A{

	
	public static void main(String[] args){
		
		//Line 1
		B b = new B();
		b.displayClassName();
		

		//Work around code
		
	/*
		// Line 2
		A a = new A();
		a.displayClassName();

		//Line 3
		A aa = new B();
		aa.displayClassName();

		//Line 4, This line will give compilation error (can't convert from A to B)
		B bb = new A();
		aa.displayClassName();
	*/
		
		
		
	}
}
