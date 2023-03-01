package com.whileloop;

import java.util.Scanner;

public class WhileArmstrong {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int copynumber=num;
		int rem,arm=0;
		while(num>0)
		{
			rem=num%10;
			arm=(rem*rem*rem)+arm;
			num=num/10;
		}
		if(copynumber==arm)
		{
			System.out.println("Number is armstrong ");
		}
		else
			System.out.println("Number is not armstrong ");
	}

}
