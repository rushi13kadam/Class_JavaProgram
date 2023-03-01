package com.Condition;

import java.util.Scanner;

public class SwitchDemo4 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		switch(num%2)
		{
		case 1:System.out.println("number is odd");
		break;
		default :System.out.println("number is even");
		break;
		}
		

	}

}
