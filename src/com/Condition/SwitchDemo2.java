package com.Condition;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Chr");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a':System.out.println("This is vowel");
		break;
		case 'e':System.out.println("This is vowel");
		break;
		case 'i':System.out.println("This is vowel");
		break;
		case 'o':System.out.println("This is vowel");
		break;
		case 'u':System.out.println("This is vowel");
		break;
		case 'A':System.out.println("This is vowel");
		break;
		case 'E':System.out.println("This is vowel");
		break;
		case 'I':System.out.println("This is vowel");
		break;
		case 'O':System.out.println("This is vowel");
		break;
		case 'U':System.out.println("This is vowel");
		break;
		default:System.out.println("This is consonant");
		}

	}

}
