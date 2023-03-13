package com.OOPsAppnaCollege;

/*polymorphism  refers to the ability of the class to provide different implementation of a methods,
 * depending on the type of object that is passed to the method.
 * polymorphism  in java allow us to perform the same action in many different ways
 * Two type of polimorphism one is compile time and other is run time polymorphism.
*/

//Compile time polimorphism:" The polymorphism which is implemented at the compile time is known as compile-time polymorphism. Example - Method Overloading"
// Method overloading is a technique which allows you to have more than one function with the same function name but with different functionality. Method overloading can be possible on the following basis: 
//The type of the parameters passed to the function. 
// The number of parameters passed to the function.

class Student2{

	
	
	public void printinfo(int age) {
		System.out.println(age);
		
	}
	
	public void printinfo(String name) {
		System.out.println(name);
	}
	public void printinfo(String name, int age) {
		System.out.println(name+" "+age);
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Student2 s1=new Student2();
		s1.printinfo(25);
		s1.printinfo("Aditya Kumar Ojha");
		s1.printinfo("Aditya Kumar Ojha",25);
				

	}

}
