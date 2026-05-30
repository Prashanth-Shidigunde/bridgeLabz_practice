package day6;
/*Write a Util Static Function to calculate monthlyPayment that reads in three
command-line arguments P, Y, and R and calculates the monthly payments you
would have to make over Y years to pay off a P principal loan amount at R per cent
interest compounded monthly. The formula is The formula is*/
import java.util.*;
public class MonthlyPayment {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter P principle, Y year, R intrest");
		int p=sc.nextInt();
		int y=sc.nextInt();
		int r=sc.nextInt();
		int n=12*y;
		double r1=r/(12.0*100);
		double Payment= ((p*r1)/(1-Math.pow(1+r1,-n)));
		System.out.println("Monthly Payment is="+Payment);
	}

}
