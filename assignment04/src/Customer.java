// Chloe Becker
// COP 3330
// 10/14/2024
// Assignment 4

public class Customer {
	String name;
	boolean business;
	public Customer(String name, boolean business) {
		this.name = name;
		this.business = business;
	}

	boolean buying(String name) {
		if(this.business == true) {
			return true;
		} else {
			return false;
		}
	}
	
	String getName() {
		return this.name;
	}
	boolean getBusiness() {
		return this.business;
	}
}
