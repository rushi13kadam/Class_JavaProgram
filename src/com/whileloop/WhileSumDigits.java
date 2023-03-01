package com.whileloop;

import java.util.Scanner;

public class WhileSumDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sum=0;
		int i=1;
		while(num>0)
		{
				int temp=num;
				temp=temp%10;
				sum=sum+temp;
				num=num/10;
				System.out.println(sum);
			}
		
		}
		

	}


