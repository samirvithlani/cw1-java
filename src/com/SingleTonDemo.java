package com;


class Employee{
	
	public static Employee emp;
	private Employee() {
		System.out.println("constructor called..");
	}
	
	public static Employee getInstance() {
		
		
		if(emp==null) {
			emp = new Employee();
			return emp;
		}
		else {
			return emp;
		}
	}
	
}
public class SingleTonDemo {

	public static void main(String[] args) {
		
		Employee emp1 =Employee.getInstance();
		Employee emp2 =Employee.getInstance();
		Employee emp3 =Employee.getInstance();
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
//		Employee emp1 = new Employee();
//		Employee emp2 = new Employee();
//		Employee emp3 = new Employee();
//		
//		System.out.println(emp1);
//		System.out.println(emp2);
//		System.out.println(emp3);
	}
}
