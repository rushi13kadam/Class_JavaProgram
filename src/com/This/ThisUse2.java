package com.This;

class ThisUse
{
	public void show()
	{
		System.out.println("1st Method");
	}
	
	public void display() 
	{
	//show();
	System.out.println("2nd Method");	
	this.show();
	}
}
	public class ThisUse2 
	{	
	public static void main(String[] args) {
		ThisUse t=new ThisUse();
		t.display();

	}

}
