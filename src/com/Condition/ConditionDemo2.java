package com.Condition;

import java.util.Scanner;

public class ConditionDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char");
		char ch=sc.next().charAt(0);
		
		if((ch>='A' && ch<='Y') ||(ch>='a' && ch<='y'))
		{
		  
				System.out.println("You Enter char");
			
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("You Enter digit");
		}
		else
		{
			System.out.println("is not Alplabet and dihit");
		}
	}

}
