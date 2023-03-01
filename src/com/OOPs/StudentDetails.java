package com.OOPs;

public class StudentDetails {

	int id;
	String name;
	int m1;
	int m2;
	int m3;
	float per;
	public void accetsDetails(int sid,String sname,int senglish,int smarathi,int shindi)
	{
		id=sid;
		name=sname;
		m1=senglish;
		m2=smarathi;
		m3=shindi;
				
	}
	
	public float calculatePercentage()
	{
	int total=m1+m2+m3;
	float per=total/3;
	return per;
	
	}
	
	public void display()
	{
		System.out.println("Student id=" +id);
		System.out.println( "Student name=" +name);
		System.out.println("English Marks="+m1);
		System.out.println("Marathi Marks=" +m2);
		System.out.println("Hindi Marks=" +m3);
		
	}
		
	
	public static void main(String[] args) {
		
		StudentDetails s=new StudentDetails();
		s.accetsDetails(1,"Rushi", 65, 70, 80);
		s.display();
		float result=s.calculatePercentage();
		System.out.println("percentage="+result);

	}

}
