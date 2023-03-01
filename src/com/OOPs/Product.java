package com.OOPs;

public class Product {

	
	String pname;
	int quantity;
	int price;
	
	public void productdetails(String name,int pquantity,int pprice)
	{
		pname=name;
		quantity=pquantity;
		price=pprice;
	}
	public void productdisplay()
	{
		System.out.println(pname);
		System.out.println(quantity);
		System.out.println(price);
	}
	public static void main(String[] args) {
		Product p=new Product();
		p.productdetails("pen", 1, 5);
		p.productdisplay();
	}

}
