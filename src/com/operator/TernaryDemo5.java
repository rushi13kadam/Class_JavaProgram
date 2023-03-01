package com.operator;

import java.util.Scanner;

public class TernaryDemo5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  first number");
		int num1=sc.nextInt();
		
		
	    System.out.println("Enter the second number");
		int num2=sc.nextInt();
		
		System.out.println("Enter the  third number");
		int num3=sc.nextInt();
		
		String result=(num1>num2 && num1>num3)?"number first is gr":(num2>num1 && num2>num3)?"number second is gr":"number third is gr";
		System.out.println(result);
		
	}

}
