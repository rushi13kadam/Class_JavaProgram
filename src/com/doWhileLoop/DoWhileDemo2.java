package com.doWhileLoop;

import java.util.Scanner;

public class DoWhileDemo2 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("Enter number in between 1 to 5");
			int num=sc.nextInt();
			
		switch(num)
		{
		
		case 1:System.out.println("one");
		break;
		case 2:System.out.println("two");
		break;
		case 3:System.out.println("three");
		break;
		case 4:System.out.println("four");
		break;
		case 5:System.out.println("five");
		break;
		default:
			System.out.println("plese eneter 1 to 5 numbar");
		}
		System.out.println("Do you want to continue");
		ch=sc.next().charAt(0);
	}while(ch=='y' || ch=='Y');
		
		}
	}


