package com.OOPs;

public class Car3 {

	int id;
	String name;
	int price;
	String colour;
	
	public static void main(String[] args) {

		Car3 c=new Car3();
		
	c.id=100;
	c.name="Swift";
	c.price=980000;
	c.colour="red";
		System.out.println(c.id);
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.colour);
		
		Car3 c1=new Car3();
		
		c1.id=200;
		c1.name="Ertiga";
		c1.price=1300000;
		c1.colour="White";
			System.out.println(c1.id);
			System.out.println(c1.name);
			System.out.println(c1.price);
			System.out.println(c1.colour);
	}

}
