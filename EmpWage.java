package com.bridgelabz.emwage;

public class EmpWage
{
	public static final int IS_FULL_TIME = 1;
	public static final int EMP_RATE_PER_HR= 20;
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
	 public static int calSalary(int empHr)
	 {
		 int dailyWage=empHr*EMP_RATE_PER_HR;
		 return dailyWage;
	 }
	 public static void calWageUC2()
	 {
		 System.out.println("UC2 Output:");
		 int empHrs=0;
		 int empCheck=(int)Math.floor(Math.random()*10)%2;
		 if(empCheck==IS_FULL_TIME)
		 {
			 empHrs=8;
		 }
		 else
		 {
			 empHrs=0;
		 }
		 int empWage=calSalary(empHrs);
		 System.out.println("Emp Wage :"+empWage);
		 
	 }
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Problem");
		//UC1
		EmpWage.checkUC1();
		//UC2
		EmpWage.calWageUC2();
	}

}
