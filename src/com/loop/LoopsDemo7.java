package com.loop;

import java.util.Scanner;

public class LoopsDemo7 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
				}
		System.out.println(fact);
	}

}
