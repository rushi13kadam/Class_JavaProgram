package com.NestedLoop;

public class SumOfPrimeNumBet1To10 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
			boolean isprime=true;
			
			for(int j=2;j<i;j++)
			{
				if(i%2==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime==true)
			{
				sum=sum+i;
			}
			//System.out.println(sum);
		}System.out.println(sum);

	}

}
