package com.WritenTest;

import java.util.Scanner;

public class FactorialSum {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number which want to disply the factorial sum");
		int num=sc.nextInt();
		int sum=0;
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			//System.out.println(mult);
			sum=sum+fact;
			
		}
		System.out.println("Sum of nth factorial number="+sum);
	}

}
