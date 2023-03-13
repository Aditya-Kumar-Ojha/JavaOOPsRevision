package com.OOPsAppnaCollege;
//All the fields in interfaces are public, static and final by default.
//all the methods are public & abstract by default.
//a class that implements an interface must implement all the methods declared in the interface.
// interfaces support the functionality of multiple inheritance.
interface Animal1{
	int NoOfEyes=2;
	void walk();
}
interface Herbivorce{
	
}
class Horse1 implements Animal1,Herbivorce{
	public void walk() {
		System.out.println("Horse walks on 4 legs");
		System.out.println(NoOfEyes);
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Horse1 horse=new Horse1();
		horse.walk();

	}

}
