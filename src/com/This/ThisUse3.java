package com.This;


class ThisUseDemo
{
	public ThisUseDemo()
	{
		this(13);
		System.out.println("Default Constructor");
	}
	public ThisUseDemo(int x)
	{
		
		System.out.println(x);
	}
}
public class ThisUse3 {

	public static void main(String[] args) {
		
		//ThisUseDemo t=new ThisUseDemo();
		ThisUseDemo t1=new ThisUseDemo();

	}

}
