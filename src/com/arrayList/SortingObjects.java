package com.arrayList;

import java.util.Arrays;
import java.util.Comparator;

public class SortingObjects {
	
	//Java provides Comparable interface which should be implemented by any custom class if we want to use Arrays 
	//or Collections sorting methods.
	//The Comparable interface has compareTo(T obj) 
	//override this method in such a way that it returns a negative integer, zero, or a positive integer 
	// if “this” object is less than, equal to, or greater than the object passed as an argument.
	public static void main(String[] args) {
		
		
		//to sort java object array or list, we need to implement java Comparable interface to provide default sorting &
		//java Comparator interface to provide different ways of sorting.


		//sorting object array
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);
		
		//sorting employees array using Comparable interface implementation
		
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
		
		
		
//		Arrays.sort(empArr, Employee.SalaryComparator);
//		System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));
//		
//		Arrays.parallelSort(empArr, Employee.AgeComparator);
//		System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));
//		
//		Arrays.parallelSort(empArr, Employee.NameComparator);
//		System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));

	}

}


class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int age;
    private int salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    //this is overridden to print the user-friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }

	@Override
	public int compareTo(Employee emp) {
		 //let's sort the employee based on an id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        return (this.id - emp.id);
	}
	
	
	//Comparator to sort employees list or array in order of Salary
	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return (e1.getSalary() - e2.getSalary());
		}
		
		
	};
	
	
	//Comparator to sort employees list or array in order of Age
	 public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getAge() - e2.getAge();
		}
		 
	 };
	
	
	
	 public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
		 
	 };
	
}