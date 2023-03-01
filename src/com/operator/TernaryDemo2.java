package com.operator;

import java.util.Scanner;

public class TernaryDemo2 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number");
		int num=sc.nextInt();
		
		String result=(num>0)?"Positive":(num<0)?"Negitive":"0";
		System.out.println(result);
	}

}
