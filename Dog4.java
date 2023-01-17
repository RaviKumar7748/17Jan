package com.rk.antra;

//Correctly finish the Dog subclass for the following abstract Animal
//class. Override the abstract methods. It should print “woof” and then
//“num num”
abstract class Animal {

	public String name;
	public int numLegs;

	public abstract void speak();

	public abstract void eat1();

}

public class Dog4 extends Animal {

	@Override
	public void speak() {
		System.out.println("woof");
	}

	@Override
	public void eat1() {
		System.out.println("num num");
	}

	public static void main(String[] args) {
		Dog4 myDog = new Dog4();
		myDog.speak();
		myDog.eat1();
	}
}
