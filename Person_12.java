package com.rk.antra;

//Override the Person class’s speak function inside the Student class.
//Make the function print “I’m a student”.
public class Person_12 {

	public void speak() {
		System.out.println("I'm a person");
	}

	public static void main(String[] args) {
		Person_12 p1 = new Student1();
		p1.speak();
	}
}

class Student1 extends Person_12 {
	@Override
	public void speak() {
		System.out.println("I’m a student");
	}

	
}
