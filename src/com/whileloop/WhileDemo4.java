package com.whileloop;

public class WhileDemo4 {

	public static void main(String[] args) {
		
		
		int i=1;
		int count=0;
		while(i<=10)
		{
			if((i%2)!=0)
			{
				count=count+1;
			}
			i++;
		}
		System.out.println("count of odd number between 1 to 10="+count);
	}

}
