package oop;


class Person{
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");		
	}
	
	void eat(){
		System.out.println(name + " is eating");
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		//Intantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@example.de";
		person1.phone = "3526456436";
		
		//Abstraction
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		
		
		/*
		//Person-
		
		
		String name = "Joe";
		String email = "joe@example.com";
		String phone = "645630809";
		
		// Action, activity, behavior
		walking(name);
		System.out.println(name + " is eating");
		
		//What if we wanted to do this for another person?
		String name2 = "Sarah";
		String email2 = "sarah@testmail.com";
		String phone2 = "534526756";
		
		// Action, activity, behavior
		walking(name2);
		System.out.println(name2 + " is eating");
	}
	//Enhance adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");*/
	}

}
