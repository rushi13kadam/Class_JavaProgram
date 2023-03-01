package com.WritenTest;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		int sum=0;
		int mult=1;
		while(num>0)
		{
			int rem=num%10;
			sum=rem+sum;
			mult=mult*rem;
			num=num/10;
		}
		System.out.println(sum);
		System.out.println(mult);
		
		if(sum==mult) {
			System.out.println("numer is spy");
		}else
			System.out.println("number is not spy");
		}
	}


