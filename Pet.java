package com.rk.antra;

public class Pet {
//	Add a call to Pet’s brag method before printing anything in Dog’s brag
//	method (hint: use super to call an overridden method). It should print
//	“I have the best pet!” and then “I have the best dog”.
	public void brag() {
		System.out.println("I have the best pet!");
	}

	public static void main(String[] args) {
		Pet d1 = new Dog3();
		d1.brag();
	}
}

class Dog3 extends Pet {
	public void brag() {
		Pet p=new Pet();
		p.brag();
		System.out.println("I have the best dog!");
	}
}
