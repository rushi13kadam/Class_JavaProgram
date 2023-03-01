package com.WritenTest;

public class Series {

	public static void main(String[] args) {
		
		int square=0;
		int cube=0;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			square=i*i;
			cube=i*i*i;
			sum=square+cube;
			System.out.println(sum);
		}
		//System.out.println(sum);

	}

}
