package day3;

public class UC6 {

	public static void main(String[] args) {
				final int IS_FULL_TIME =2;
				final int IS_PART_TIME =1;
				final int EMP_RATE_PER_HOUR = 20;
				final int Num_OF_WORKINGDAYS = 2;
				final int MAX_HRS_IN_MONTH = 10;
				
				int empHrs=0;
				int empWage = 0;
				//int totalEmpWage = 0;
				int totalWorkingDays=0;
				int totalEmpHrs=0;
				
				while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays<Num_OF_WORKINGDAYS){
					totalWorkingDays++;
					
					double empCheck = Math.floor(Math.random()*10)%2;
					switch((int)empCheck) {
					case IS_FULL_TIME: empHrs = 8;
										break;
					case IS_PART_TIME: empHrs = 4;
										break;
					default : empHrs=0;
					}
					totalEmpHrs+=empHrs;
					//empWage = empHrs * EMP_RATE_PER_HOUR;
					System.out.println("Days# :"+totalWorkingDays+" Emp Hrs: "+empHrs);
				}
				int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
				System.out.println("Total Employeee wage: "+totalEmpWage);
				//System.out.println("Total EMployee Hours: "+totalEmpHrs);


	}

}
