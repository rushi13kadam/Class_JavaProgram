package com.whileloop;

import java.util.Scanner;

public class WhileEvenDigits {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int evencount=0,rem;
		
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			
				evencount++;
			num=num/10;
		}

		System.out.println("even count="+evencount);
	}

}
