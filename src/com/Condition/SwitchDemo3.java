package com.Condition;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int length=sc.nextInt();
		System.out.println("Enter the weidth");
		int weidth=sc.nextInt();
		System.out.println("Enter the radius");
		int radius=sc.nextInt();
		System.out.println("Enter the side");
		int side=sc.nextInt();
		System.out.println("Enter the height");
		int height=sc.nextInt();
		System.out.println("Enter the base");
		int base=sc.nextInt();
		
		
		System.out.println("Enter the Following Areas");
		System.out.println("r.Rectangle \t c.Circle \t s.Square \t t.triangle");
		
		char op=sc.next().charAt(0);
		switch(op)
		{
		case 'r':
			System.out.println("Area Of Rectangle="+(length*weidth));
		break;
		
		case 'c': System.out.println("Area Of Circle="+(3.14*radius*radius));
		break;
		
		case 's': System.out.println("Area Of Square="+(side*side));
		break;
		
		case 't': System.out.println("Area Of triangle="+(height*base)/2);
		break;
		}
		
	}

}
