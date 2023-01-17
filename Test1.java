package com.rk.antra;

//Create an interface named Test that has a void talk method and void
//walk method.
interface Test {
	void talk();

	void walk();

}

public class Test1 implements Test {

	@Override
	public void talk() {
		System.out.println("talking....");
	}

	@Override
	public void walk() {
		System.out.println("walking....");
	}

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.talk();
		obj.walk();

	}

}
