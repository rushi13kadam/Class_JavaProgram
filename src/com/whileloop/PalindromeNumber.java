package com.whileloop;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int copynumber=num;
		int reverse=0;
			while(num>0)
			{
				int rem=num%10;
				reverse=reverse*10+rem;
				num=num/10;
			}
			
			if(copynumber==reverse)
			{
				System.out.println("Palindrome Number");
			}
			else
			{
				System.out.println("not palindrome number");
			}
	}

}
