package com.bridgelabz.emwage;

public class EmpWage
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME=2;
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
	 public static int calOption()
	 {
		 int res=(int)Math.floor(Math.random()*10)%3;
		 return res;
	 }
	 public static void calWageUC3()
	 {
		 System.out.println("UC3 Output:");
		 int empHr=0;
		 int res=calOption();
		 if(res==IS_FULL_TIME)
		 {
			 empHr=8;
		 }
		 else if(res==IS_PART_TIME)
		 {
			 empHr=4;
		 }
		 else
		 {
			 empHr=0;
		 }
		 int empWage=calSalary(empHr);
		 System.out.println("Emp Wage :"+empWage);
		 
	 }
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Problem");
		//UC1
		EmpWage.checkUC1();
		//UC2
		EmpWage.calWageUC2();
		//UC3
	    EmpWage.calWageUC3();
	}

}
