package com.rk.antra;

//Add public getter and setter methods to the Store class so its
//variables can be accessed by other classes. It should print the store’s
//name and address and then change both and print the new values.
public class Store {
	private String name;
	private String address;

	public Store(String theName, String theAddress) {
		this.name = theName;
		this.address = theAddress;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String toString() {
		return this.name + "\n" + this.address;
	}

	public static void main(String[] args) {
		Store myStore = new Store("Barb's Store", "333 Main St.");
		System.out.println(myStore);
		myStore.setName("Barbara's Store");
		myStore.setAddress("555 Pine St.");
		System.out.println(myStore);
	}

}
