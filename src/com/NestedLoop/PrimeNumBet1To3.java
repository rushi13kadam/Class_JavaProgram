package com.NestedLoop;

public class PrimeNumBet1To3 {

	public static void main(String[] args) {
		
		
		for(int num=1;num<=10;num++)
		{
			boolean isprime=true;
			
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
				isprime=false;
				break;
				}
			}
		}

	}

}
