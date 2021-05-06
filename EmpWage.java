package com.bridgelabz.emwage;

public class EmpWage
{
	public static final int IS_FULL_TIME = 1;
	public static void checkUC1()
	 {
		 System.out.println("UC1 Output:");
		 int empCheck=(int)Math.floor(Math.random()*10)%2;
		 if(empCheck==IS_FULL_TIME)
		 {
			 System.out.println("Employee is present");
		 }
		 else
		 {
			 System.out.println("Employee is absent");
		 }
	 }
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Problem");
		//UC1
		EmpWage.checkUC1();
		
	}

}
