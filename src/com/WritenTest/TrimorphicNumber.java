package com.WritenTest;

import java.util.Scanner;

public class TrimorphicNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		int cube=num*num*num;
		int temp=num;
		boolean isTrimorphic=true;
			 
			  while(temp!=0) 
			  {
			 if(temp%10!=cube%10)
			 {
				 isTrimorphic=false;
				 break;
			 }
				 temp=num/10;
				 cube=cube/10;
			  if(isTrimorphic)
				 {
					 System.out.println("Number is trimorphic"+num);
				 }
			 else
			 {
				 System.out.println("Number is not trimorphic"+num);
			  }
	}
}
}