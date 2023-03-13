package com.OOPsAppnaCollege;
//abstraction is hiding the implementation details and showing importand/useful parts to the user.
// an abstract class must be declared with an abstract keyword
// it can have abstract and non-abstract methods
//it cann't be instantiated (Object can't be created)
//it can have contructors and static methods also.
//it can have final methods which will force to subclass not to change the body or the method.
abstract class Animal{
	abstract void walk() ;
	Animal(){
		System.out.println("you are creating new animal");
	}
	public void eat() {
		System.out.println("Animal eats");
		
	}
}		
class Horse extends Animal{
	Horse(){
		System.out.println("Created a horse");
	}
	public void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}
class Chicken extends Animal{
	public void walk() {
		System.out.println("Chicken Walks on 2 legs");
	}
}

public class abstractionDemo {

	public static void main(String[] args) {
		Horse horse =new Horse();
		horse.walk();
		horse.eat();
//		Animal animal=new Animal();
//		animal.walk();

	}

}
