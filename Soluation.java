package com;

public class Soluation {
	static void findHighestMarks(Student s1, Student s2) {
		//complete the code
		if(s1.marks>s2.marks) {
			System.out.println(s1);
		}
		else
			System.out.println(s2);
	}
	public static void main(String[] args) {
		Student s1=new Student("Alex",78);
		Student s2=new Student("Jack",89);
		findHighestMarks(s1,s2);
	}
}
