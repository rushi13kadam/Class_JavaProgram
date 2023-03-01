package com.Condition;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");	
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Number is Positive");
		}
		else if(num<0)
		{
			System.out.println("Number is negitive");
		}
		else if(num==0)
		{
			System.out.println("Number is 0");
		}
		
	}

}
