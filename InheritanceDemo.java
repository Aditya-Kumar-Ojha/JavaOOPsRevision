//Inheritance is a process in which one object/class acquires all the properties and behaviors of its parent object/class automatically
package com.OOPsAppnaCollege;

//class Shape
//{
//	String color;
//	String hape;
//}	
//class Triangle extends Shape
//	{
//		
//	}
//
//public class InheritanceDemo {
//	public static void main(String[] args) 
//	{
//		Triangle t1=new Triangle();
//		t1.color="Red";
//		t1.hape="Tri";
//	}
//
//}

//single level inheritance

class Shape
{
	public void area()
	{
		System.out.println("Displays Area");
	}
}	
class Triangle extends Shape
	{
		public void area(int l,int h)
		{
			System.out.println((l*h)/2);
		}
	}
//Multi level inheritance
//class EquilateralTrianle extends Triangle
//{
//	public void area(int l,int h) 
//	{
//		System.out.println((l*h)/2);
//	}
//}

//Hierarchial Inheritance
class circle extends Shape
{
	public void area(int r)
	{
		System.out.println((3.14*r*r));
	}
}
//hybrid Inheritance(it includes single level inheritance , multi level and Hierarchial);
public class InheritanceDemo {
	public static void main(String[] args) 
	{
		Triangle t1=new Triangle();
		t1.area(17, 15);
		
//		EquilateralTrianle t2=new EquilateralTrianle();
//		t2.area(20, 30);
		
		circle t3=new circle();
		t3.area(3);
	}

}
