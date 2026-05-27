package day3;

public class UsingSwitch {

	public static void main(String[] args) {
				final int IS_FULL_TIME =2;
				final int IS_PART_TIME =1;
				final int EMP_RATE_PER_HOUR = 20;
				final int Num_OF_WORKINGDAYS = 2;
				int empHrs=0;
				int empWage = 0;
				int totalEmpWage = 0;
				for(int day=0;day<Num_OF_WORKINGDAYS;day++) {
					double empCheck = Math.floor(Math.random()*10)%2;
					switch((int)empCheck) {
					case IS_FULL_TIME: empHrs = 8;
										break;
					case IS_PART_TIME: empHrs = 4;
										break;
					default : empHrs=0;
					}
					empWage = empHrs * EMP_RATE_PER_HOUR;
					totalEmpWage += empWage;
					System.out.println("EmpWage :"+empWage);
				}
				System.out.println("Total Employeee wage: "+totalEmpWage);


	}

}
