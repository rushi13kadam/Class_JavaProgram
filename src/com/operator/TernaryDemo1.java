package com.operator;

import java.util.Scanner;

public class TernaryDemo1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		
		String result=(num1>num2)?"num1 is grater":"num2 is grater";
		System.out.println(result);
	}

}
