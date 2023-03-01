package com.basic;

public class Operator {

	public static void main(String[] args) {

		//Relation/conditional   <,>,<=,>=,!=,==
		int a=80;
		int b=70;
		System.out.println(a>b);
		
		//Logical &&,||,!
		int c=50;
		System.out.println((a<b)&&(a>c));
		System.out.println((a<b)||(a>c));

		//Asignement
		int x=3;
		x+=10;  //x=x+10
		x-=7;
		x*=2;
		x/=2;
		x%=3;
		System.out.println(+x);
	}

}
