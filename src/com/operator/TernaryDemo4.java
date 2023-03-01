package com.operator;

import java.util.Scanner;

public class TernaryDemo4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number");
		int num=sc.nextInt();
		
		String result=(num<100) || (num>15)?"Number is than less 100":"Number is grater than 15";
		System.out.println(result);
	}

}
