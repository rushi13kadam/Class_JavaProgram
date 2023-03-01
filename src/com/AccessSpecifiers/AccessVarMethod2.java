package com.AccessSpecifiers;

public class AccessVarMethod2 {

	public static void main(String[] args) {
		
		AccessVarMethod a=new AccessVarMethod();
		a.name="Rushi";
		System.out.println("Default Variable="+a.name);
		a.display();
		
		
		a.colour="Red";
		System.out.println("Public variable="+a.colour);
		a.display2();
		
	}

}
