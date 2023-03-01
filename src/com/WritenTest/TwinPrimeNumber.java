package com.WritenTest;

import java.util.Scanner;

public class TwinPrimeNumber {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int num2=sc.nextInt();
		int count1=0;
		int count2=0;
		int diff;
		
		for(int i=1;i<=num1;i++)
		{
			if(num1%i==0)
			{
				count1++;
			}
		}
		for(int i=1;i<=num2;i++)
		{
			if(num2%i==0)
			{
				count2++;
			}
		}
		diff=num1-num2;
			
			if((diff==2 || diff==-2) && count1==2 && count2==2)
			{
				System.out.println("Twin Prime number");
			}
			else
			{
				System.out.println("Not Twin Prime Number");
			}
		}

}
