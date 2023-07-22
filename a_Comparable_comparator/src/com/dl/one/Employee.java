package com.dl.one;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	

	


	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}





	@Override
	public int compareTo(Employee emp) {
		return name.compareTo(emp.name);
		
		
	}
	

}
