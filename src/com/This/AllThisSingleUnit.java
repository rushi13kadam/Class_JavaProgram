package com.This;

//Second use of This
class ThisUse4
{
	public void show()
	{
		this.display();
		System.out.println("1st Method");
	}
	public void display()
	{
		System.out.println("2nd Method");
	}
}
// Thid use of This
class ThisUse5
{
	public ThisUse5()
	{
		System.out.println("1st constructor");
	}
	
	public ThisUse5(int x)
	{
		this();
		System.out.println(x);
	}
}
public class AllThisSingleUnit {

	
	//1)First use of this
	int num;
	String name;
	
	public void input(int num,String name)
	{
		this.num=num;
		this.name=name;
	}
	public void display() 
	{
		System.out.println(num);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		AllThisSingleUnit t=new AllThisSingleUnit();
		t.input(13,"Rushi");
		t.display();
				
		ThisUse4 t2=new ThisUse4();
		t2.show();
		//t2.display();
		
		//ThisUse5 t3=new ThisUse5();
		ThisUse5 t4=new ThisUse5(15);
	}

}
