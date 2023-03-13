package com.OOPsAppnaCollege;
class Student1{
	String Name;
	int Age;
	String Subject;
	
	public void printStudentInfo() {
		System.out.println(this.Name);
		System.out.println(this.Age);
		System.out.println(this.Subject);
	}

//Non-Parameterized constructor 
	Student1(){
		System.out.println("Hello Java I am contructor");
	}
// 	Parameterized constructor 
	Student1(String name, int age, String subject){
		this.Name=name;
		this.Age=age;
		this.Subject=subject;
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.Name="Aditya Kumar Ojha";
		s1.Age=26;
		s1.Subject="computer science engineering";
		s1.printStudentInfo();

	}

}
