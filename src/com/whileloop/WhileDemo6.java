package com.whileloop;

public class WhileDemo6 {

	public static void main(String[] args) {
		// even number sum 1 to 10
		 
		int i=1;
		 int sum=0;
		 while(i<=10)
		 {
			 if(i%2==0)
			 {
				 sum=sum+i;
			 }
			 i++;
		 }
		 System.out.println("sum of even between 1 to 10="+sum);
	}
}


