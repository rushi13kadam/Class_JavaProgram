package com.Condition;

import java.util.Scanner;

public class ConditionDiv {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num1=sc.nextInt();
		
		/*if(num1%3==0)
		{
			if(num1%9==0)
			{
				
			}
		System.out.println("Number is div by 3 and 9");	
		}
		else
		{
			System.out.println("Number is not div by 3 & 9");
		}*/
		
		
		if(num1%3==0 && num1%9==0)
		{
			System.out.println("Number is div by 3 and 9");
		}
		else
		{
			System.out.println("Number is not div by 3 & 9");
		}
	}

}
