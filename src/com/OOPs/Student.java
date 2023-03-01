package com.OOPs;

public class Student {

	
	int id;
	String name;
	float marks;
	
	public static void main(String[] args) {
		

		Student stud;
		stud=new Student();
		
		stud.id=101;
		stud.name="Rushikesh";
		stud.marks=68f;
		
		System.out.println(stud.id);
		System.out.println(stud.name);
		System.out.println(stud.marks);
		
		
		
	}

}
