package com.bridgelabz.emwage;

public class EmpWage
{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HR= 20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;

	
	//UC8
	private final String company;
	private final int empRate;
	private final int numOfWorkingDays;
	private final int maxHrs;
	private int totalWage;
	
	public EmpWage(String company,int empRate,int numOfWorkingDays,int maxHrs)
	{
		this.company=company;
		this.empRate=empRate;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHrs=maxHrs;
		
	}

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
	public static void calWageUC4()
	{
		System.out.println("UC4 output:");
		int empHr=0;
		int res=calOption();
		switch(res)
		{
		case IS_FULL_TIME:
			empHr=8;
			break;
		case IS_PART_TIME:
			empHr=4;
			break;
		default:
			empHr=0;
			break;
		}
		int empWage=calSalary(empHr);
		System.out.println("Emp Wage using switch case :"+empWage);

	}
	public static void calWageUC5()
	{
		System.out.println("UC5 Output:");
		int empHr=0;
		int totalEmpHr=0;
		for(int i=1;i<=NUM_OF_WORKING_DAYS;i++)
		{
			int res=calOption();
			switch(res)
			{
			case IS_FULL_TIME:
				empHr=8;
				break;
			case IS_PART_TIME:
				empHr=4;
				break;
			default:
				empHr=0;
				break;
			}
			totalEmpHr+=empHr;

		}
		int empWage=calSalary(totalEmpHr);
		System.out.println("Emp Wage of 20 days:"+empWage);
	}
	public static void calWageUC6()
	{
		System.out.println("UC6 Output:");
		int empHr=0;
		int totalEmpHr=0;
		int totalWorkingDays=0;
		while(totalEmpHr<MAX_HRS_IN_MONTH&&totalWorkingDays<NUM_OF_WORKING_DAYS)
		{
			int res=calOption();
			switch(res)
			{
			case IS_FULL_TIME:
				empHr=8;
				break;
			case IS_PART_TIME:
				empHr=4;
				break;
			default:
				empHr=0;
				break;
			}
			totalEmpHr+=empHr;
			totalWorkingDays++;

		}
		int empWage=calSalary(totalEmpHr);
		System.out.println("Total Employee Wage of maximum 100 hours and 20 days : "+empWage);

	}
	public void calWageUC8(EmpWage e1)
	{
		
		int empHr=0;
		int totalEmpHr=0;
		int totalWorkingDays=0;
		while(totalEmpHr<e1.maxHrs&&totalWorkingDays<e1.numOfWorkingDays)
		{
			int res=calOption();
			switch(res)
			{
			case IS_FULL_TIME:
				empHr=8;
				break;
			case IS_PART_TIME:
				empHr=4;
				break;
			default:
				empHr=0;
				break;
			}
			totalEmpHr+=empHr;
			totalWorkingDays++;

		}
		totalWage=totalEmpHr*e1.empRate;
		System.out.println("Total Employee Wage for Company "+e1.company+" is "+totalWage);

	}
	public String toString()
	{
		return "Total Employee Wage for company "+company+"is "+totalWage;
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
		//UC4
		EmpWage.calWageUC4();
		//UC5
		EmpWage.calWageUC5();
		//UC6
		EmpWage.calWageUC6();
		//UC7
		System.out.println("UC7 Output:");
		System.out.println("Refactored code by using class method");
		//UC8
		System.out.println("UC8 Output:");
		EmpWage infosys=new EmpWage("Infosys",10,20,50);
		infosys.calWageUC8(infosys);
		EmpWage wipro=new EmpWage("Wipro",20,25,100);
		wipro.calWageUC8(wipro);
		//UC9
		System.out.println("UC9 Output");
	    System.out.println(infosys);
	    System.out.println(wipro);
	}

}
