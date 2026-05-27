package day3;

public class EmpWageBuilder {

	public static void main(String[] args) {
		final int IS_FULL_TIME =2;
		final int IS_PART_TIME =1;
		final int EMP_RATE_PER_HOUR = 20;
		int empHrs=0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == IS_FULL_TIME)
			empHrs = 8;
		else if(empCheck == IS_PART_TIME)
			empHrs=4;
		else 
			empHrs=0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("EmpWage :"+empWage);

	}

}
