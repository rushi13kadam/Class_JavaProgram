package com.Condition;

import java.util.Scanner;

public class CoonditionDemo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
	
		
		if(age>16)
		{
			System.out.println("person is eligible for driving licence");
		}
		else
		{
			System.out.println("person is not eligible for driving licence");
		}

	}

}
