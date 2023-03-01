package com.Encapsulation;

public class CarMain {

	public static void main(String[] args) {
		Car c=new Car();
		c.settId(100);
		c.setName("BMW");
		c.setPrice(3000000);
		c.setColour("White");
		
		System.out.println("Car id="+c.getId());
		System.out.println("Car Name="+c.getName());
		System.out.println("Car Price="+c.getPrice());
		System.out.println("Car colour="+c.getColour());
		
		
		
		
		

	}

}
