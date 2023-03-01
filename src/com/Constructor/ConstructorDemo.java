package com.Constructor;

public class ConstructorDemo {

	int id;
	String name;
	
	public ConstructorDemo()
	{
		System.out.println("i am default");
	}
	
	public ConstructorDemo(int cid,String cname)
	{
		id=cid;
		name=cname;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		ConstructorDemo c=new ConstructorDemo();
		ConstructorDemo c1=new ConstructorDemo(100,"BMW");
		c1.display();

	}

}
