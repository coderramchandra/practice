package com;

public class Student {
	String name;
	int marks;
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return name+" has score "+marks+" marks";
	}

	public static void main(String[] args) {
		Student s1=new Student("Tom",50);
		System.out.println(s1.toString());

	}
}
