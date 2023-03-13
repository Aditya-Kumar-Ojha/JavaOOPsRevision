package com.OOPsAppnaCollege;

class Account{
	public String name;     //it can be accessible form anywhere like different packages and classes as well as same class and packages
	String age;             //it can be accessible form only inside the packages and classes
	protected String email; //it can be accessible form only inside the packages and subclass of different packages
	private String password;//it can be accessible inside the current class to access it we use getters and setter method 
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

public class AccessModifersDemo {

	public static void main(String[] args) {
		
		Account account1=new Account();
		account1.name="Appna College";
		account1.age="26";
		account1.name="Adityakrojha@gmail.com";
		account1.setPassword("abcde");
		System.out.println(account1.getPassword());

	}

}
