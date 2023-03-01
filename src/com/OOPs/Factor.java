package com.OOPs;

import java.util.Scanner;

public class Factor {

	public void factor(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Factor f=new Factor();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		f.factor(num);

	}

}
