package com.This;

public class ThisUse1 {

	int num;
	
	public void input(int num)
	{
		this.num=num;
	}
	public void display()
	{
		System.out.println(num);
	}
	public static void main(String[] args) {
		ThisUse1 t=new ThisUse1();
		t.input(100);
		t.display();

	}

}
