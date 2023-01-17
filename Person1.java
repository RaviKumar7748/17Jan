package com.rk.antra;
//Override the compareTo method so that it returns a postive number if

//the current Person is older than the passed other and a negative
//number if they are younger. If their age is the same then return the
//compareTo result on the names.

public class Person1 implements Comparable<Person> {
	private String name;
	private int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Person1 other) {
		if (this.age > other.age) {
			return -1;
		} else {
			if (this.age == other.age) {
				System.out.print(other.name + " " + this.name + "->" + "Having same age"+"  ");
				return this.age;
			}
		}

			return 1;
	}

	public static void main(String[] args) {
		Person1 p1 = new Person1("Carlos", 17);
		Person1 p2 = new Person1("Lia", 18);
		Person1 p3 = new Person1("Asraf", 17);
		Person1 p4 = new Person1("Lia", 17);
		Person1 p5 = new Person1("Karla", 17);
		System.out.println(p1.compareTo(p2));
		System.out.println(p2.compareTo(p3));
		System.out.println(p3.compareTo(p1));
		System.out.println(p4.compareTo(p3));
		System.out.println(p4.compareTo(p5));
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
