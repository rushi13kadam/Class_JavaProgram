package com.whileloop;

public class NumberDivBy3abd9 {

	public static void main(String[] args) {
		int i=1;
		while(i<=20)
		{
			if(i%3==0 && i%9==0)
			{
				System.out.println(i);
				break;
			}
			i++;
		}
		

	}

}
