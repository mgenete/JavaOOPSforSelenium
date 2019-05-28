package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee {
	
	String name;
	String dept;
	int salary;
	
	public Employee(String name, String dept, int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
}



public class ITemployee {

	public static void main(String[] args) {


		Employee emp1 = new Employee("Teddy", "Fin", 60000);
		Employee emp2 = new Employee("Steven", "Fin", 70000);
		Employee emp3 = new Employee("Martha", "IT", 60000);
		Employee emp4 = new Employee("Fred", "IT", 80000);
		Employee emp5 = new Employee("Yonas", "IT", 160000);
		Employee emp6 = new Employee("Mike", "IT", 90000);
		Employee emp7 = new Employee("Bruno", "Fin", 80000);
		Employee emp8 = new Employee("Patty", "Admin", 360000);
		
		Set<Employee> set = new HashSet<Employee>();
		set.add(emp8);
		set.add(emp7);
		set.add(emp6);
		set.add(emp5);
		set.add(emp4);
		set.add(emp3);
		set.add(emp2);
		set.add(emp1);
		set.add(emp8); //duplicate elements are ignored
		set.add(emp7);//duplicate elements are ignored
		
		
//		for(Employee s: set) {
//			if(s.dept.equalsIgnoreCase("it")){
//				System.out.println(s.name+" "+s.salary);
//		}
		
			//System.out.println("++++");
		Iterator<Employee> it = set.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			if(e.dept.equalsIgnoreCase("it")){
				System.out.println(e.name+" "+e.salary);
			}
					
			
		}
		
		}

	}


