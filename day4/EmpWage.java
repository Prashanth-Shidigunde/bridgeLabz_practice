package day4;
/* UC1 - Start with Displaying Welcome to Employee Wage Computation
 * 		Check Employee is Present or Absent- Use ((RANDOM)) for Attendance Check
 * UC2 - Calculate Daily Employee Wage (Assume Wage PerHour is 20, full day hour is 8
 * UC3 - Add Part time Employee & Wage - Assume Part time Hour is 4
 * UC4 -Solving using Switch Case Statement
 * UC5 - Calculating Wages for a Month - Assume 20 Working Day per Month
 * UC6 -Calculate Wages till a condition of total working hours or days is reached for a 		month
 * 
 * 
 * 
 * */

import java.util.Scanner;

class EmpWageCalculation {
	static final int PRESENT=1;
	static final int IS_PART_TIME=1;
	static final int IS_FULL_TIME=2;
	static final int DAYS_PER_MONTH=20;
	
	static final int WAGE_PER_HOUR = 20;
	
	int employee_working_hour = 0;
	int wage;
	
	//employee month wage calculation 
	public int  empWageCal(int employee) {
		int dailyEmpWage=0;
		int monthlyWage=0;
		employee_working_hour=(employee*4);
		dailyEmpWage=employee_working_hour*WAGE_PER_HOUR;
		monthlyWage=dailyEmpWage*DAYS_PER_MONTH;
		return monthlyWage;
	}
	
	//employee daily wage calculation 
	public int  dailyempWageCal(int employee) {
		int dailyEmpWage=0;
		employee_working_hour=(employee*4);
		dailyEmpWage=employee_working_hour*WAGE_PER_HOUR;
		return dailyEmpWage;
	}
	
	//employee attendance checker
	public void attendanceCheck(Scanner sc) {
		int attendance = (int)Math.floor(Math.random()*10)%2;
		if(attendance == PRESENT) {
			System.out.println("Employee is present");
			System.out.println("check are you part time or full time parttime=1, fulltime=2 press only 1 or 2");
			int employee=sc.nextInt();
			
			switch(employee) {
			case 1:
				System.out.println("Part Time employer is Present");
				//wage=empWageCal(employee);
				wage=wage+dailyempWageCal(employee);
				//System.out.println("Wage Of Part Time Employee is ="+wage);
				break;
			case 2:
				System.out.println("Full time is employer is present");
				//wage=empWageCal(employee);
				wage=wage+dailyempWageCal(employee);
				//System.out.println("Wage Of Full Time Employee is ="+wage);
				break;
			default:
				System.out.println("Invalid Input");
				
			}
			
//			if(employee==1) {
//				System.out.println("Part Time employer is Present");
//				int wage=empWageCal(employee);
//				System.out.println("Wage Of Part Time Employee is ="+wage);
//			}
//			else {
//				System.out.println("Full time is employer is present");
//				int wage=empWageCal(employee);
//				System.out.println("Wage Of Full Time Employee is ="+wage);
//			}
		}
		else {
			System.out.println("Employee is absent");
			//employee_working_hour=0;
		}
	}
}

public class EmpWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation\n-------------------------------------");
		Scanner sc=new Scanner(System.in);
		EmpWageCalculation ec= new EmpWageCalculation();
		int count=0;
		while(count<20) {
		ec.attendanceCheck(sc);
		count++;
		System.out.println(count+" completed");
		}
		System.out.println("Employee got salary of this month = $"+ec.wage);
		
		

	}

}
