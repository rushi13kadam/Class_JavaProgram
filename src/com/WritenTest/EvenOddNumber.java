package com.WritenTest;

public class EvenOddNumber {

	public static void main(String[] args) {
	
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number="+i);
			}
			else if((i%2)!=0)
			{
				System.out.println("Odd number negative value with it's square="+(-(i*i)));
			}
		}

	}

}
