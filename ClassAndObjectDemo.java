package com.OOPsAppnaCollege;

//class Pen{
//	String color;
//	String type;
//	
//	public void write() {
//		System.out.println("writing something");
//	}
//	public void printInfo() {
//		System.out.println(this.color);
//		System.out.println(this.type);
//	}
//	
//}

class Student{
	String Name;
	int Age;
	String Subject;
	
	public void printStudentInfo() {
		System.out.println(this.Name);
		System.out.println(this.Age);
		System.out.println(this.Subject);
	}
	// Non-Parameterized constructor 
	Student(){
		System.out.println("Hello Java I am contructor");
	}
	
	//Parameterized constructor 
	Student(String name,int age){
		this.Name=name;
		this.Age=age;
		
	}
}
public class ClassAndObjectDemo {

	public static void main(String[] args) {
		
//		Pen pen1=new Pen();
//		pen1.color="blue";
//		pen1.type="gen";
//		pen1.write();
//		pen1.printInfo();
//		
//		System.out.println();
//		
//		Pen pen2=new Pen();
//		pen2.color="black";
//		pen2.type="ballPoint";
//		pen2.write();
//		pen2.printInfo();
		
//		Student s1=new Student();
//		s1.Name="Aditya Kumar Ojha";
//		s1.Age=26;
//		s1.Subject="computer science engineering";
//		s1.printStudentInfo();
//		
//		Student s2=new Student();
//		s2.Name="Pritam Kumar";
//		s2.Age=26;
//		s2.Subject="electronics and communication engineering";
//		s2.printStudentInfo();
		
		Student s1=new Student("Aditya",25);
    	s1.printStudentInfo();
		

	}

}
