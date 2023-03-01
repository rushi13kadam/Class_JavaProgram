package com.AccessSpecifiers;

public class AccessVarMethod {

	private int id;
	String name;
	protected int price;
	public String colour;
	
	private void show()
	{
		System.out.println("Private Method");
	}
	
	void display()
	{
	System.out.println("Default Method");	
	}
	
	protected void show2()
	{
		System.out.println("Protected Method");
	}
	public void display2()
	{
		System.out.println("Public Method");
	}
	
	public static void main(String[] args) {
		AccessVarMethod a=new AccessVarMethod();
		a.id=100;
		System.out.println("Privated Variable="+a.id);
		a.show();
			
		a.colour="Red";
		System.out.println("Public variable="+a.colour);
		a.display2();
	}
}
