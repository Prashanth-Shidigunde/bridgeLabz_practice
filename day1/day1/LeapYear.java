package day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();
		if(year<1582) {
			System.out.println("Invalid year");
			return;
		}
		if(((year%4==0) && (year%100 != 0)) || (year%400 ==0)) {
			System.out.println(year+" is Year is Leap Year");
		}
		else {
			System.out.println(year+" is Not Leap Year");
		}
	

	}

}
