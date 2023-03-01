package com.whileloop;

import java.util.Scanner;

public class AverageOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int count=0,sum=0;
		
		while(num!=0)
		{
			int r=num%10;
			sum=sum+r;
			count++;
			num=num/10;
		}
			int avg=(sum/count);
			System.out.println(avg);

	}
	}
