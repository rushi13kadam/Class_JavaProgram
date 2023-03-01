package com.basic;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter Number");
		number=sc.nextInt();
		
		int x=number*number*number;
		System.out.println("Cube ="+x);


	}

}
