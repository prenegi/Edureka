package day5;

public class Employee {
	
	int salary,bonus;
	
	//Constructor
	public Employee() {
		salary=100;
		bonus=23;
		System.out.println("Welcome to Employee class");
	}
	
	public Employee(int salary,int bonus) {
		this.salary=salary;
		System.out.println(this.salary);
	}

	public void CalculateSalary() {
		int total;
		total=salary+bonus;
		System.out.println("Printing total salary :"+total);
	}
	
	public int CalculateSalary1(int salary,int bonus) {
		System.out.println(this.salary);
		return bonus;
	}

}
