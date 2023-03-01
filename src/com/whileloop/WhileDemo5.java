package com.whileloop;

import java.util.Scanner;

public class WhileDemo5 {

	public static void main(String[] args) {
		
		int i=1,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number witch want to table");
		int num=sc.nextInt();
		
		while(i<=10) 
		{
			
			System.out.println(num+"*"+i+"="+(num*i));
			i++;
		}
	
		

	}

}
