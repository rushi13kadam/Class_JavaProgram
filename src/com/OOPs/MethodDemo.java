package com.OOPs;

public class MethodDemo {

	
	
	//1) no return type no parameter
	public void show()                     //method defination//method implementation
	{
		System.out.println("Show Method....");
	}
	
	//2) no return type with parameter
	public void addition(int x,int y)
	{
		int a=x+y;
		System.out.println(a);
	}
	
	//3) method will return typeno parameter
	public String getcity()
	{
		String city="pune";
		return city;
	}
	
	// 4)Method with return type and parameter
	
	public double areaofcircle(int r,double pi)
	{
		double area=pi*r*r;
		return area;
	}
	public static void main(String[] args) {
		
		MethodDemo m=new MethodDemo();
		m.show();       //Method Calling
		m.addition(4, 5);
		
		String mycity=m.getcity();
		System.out.println(mycity);
		
		double result=m.areaofcircle(4, 3.14);
		System.out.println("Area of circle"+result);
		
	}

}
