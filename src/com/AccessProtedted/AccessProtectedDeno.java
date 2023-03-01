package com.AccessProtedted;

import com.AccessSpecifiers.AccessVarMethod;


public class AccessProtectedDeno extends AccessVarMethod {

	public static void main(String[] args) {
		
		AccessVarMethod a1=new AccessVarMethod();
		AccessProtectedDeno a=new AccessProtectedDeno();
		a.price=300000;
		System.out.println("Protected Variable="+a.price);
		a.show2();
		
		a1.colour="Red";
		System.out.println("Public variable="+a1.colour);
		a1.display2();
		
	}

}
