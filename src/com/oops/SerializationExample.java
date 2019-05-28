package com.oops;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {
	
	//ObjectOutputStream in Java can be used to convert an object to OutputStream. 
	//The process of converting object to stream is called serialization in java.

	public static void main(String[] args) {
		Employee emp = new Employee("Pankaj");
		emp.setAge(35);
		emp.setGender("Male");
		emp.setRole("CEO");
		System.out.println(emp);
		
		try {
			FileOutputStream fos = new FileOutputStream("EmployeeObject.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// write object to file
			oos.writeObject(emp);
			System.out.println("Done");
			// closing resources
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}



class Employee implements Serializable {

	private static final long serialVersionUID = -299482035708790407L;

	private String name;
	private String gender;
	private int age;

	private String role;
	// private transient String role;

	public Employee(String n) {
		this.name = n;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee:: Name=" + this.name + " Age=" + this.age + " Gender=" + this.gender + " Role=" + this.role;
	}

}
