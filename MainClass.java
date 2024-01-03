package com;

public class MainClass {
	static void findHighestSalary(Employee e1, Employee e2, Employee e3) {
		if(e1.sal>e2.sal && e1.sal>e3.sal) {
			System.out.println(e1.name+" has the highest sal: Rs."+e1.sal);
		}
		else if(e2.sal>e3.sal) {
			System.out.println(e2.name+" has the highest sal: Rs."+e2.sal);
		}
		else {
			System.out.println(e3.name+" has the highest sal: Rs."+e3.sal);
		}
	}
	public static void main(String[] args) {
		Employee e1=new Employee("Ram",23000.90);
		Employee e2=new Employee("Krish",24000.90);
		Employee e3=new Employee("Sandip",23000.90);
		findHighestSalary(e1, e2, e3);

	}
}
