package com.WedHomeWork;

import java.util.Scanner;

public class PatternDemo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2!=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}
