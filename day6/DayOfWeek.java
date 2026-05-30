/* To the Util Class add dayOfWeek static function that takes a date as input and
prints the day of the week that date falls on. Your program should take three
command-line arguments: m (month), d (day), and y (year). For m use 1 for January,
2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for
Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where
/ denotes integer division):
y0 = y − (14 − m) / 12
x = y0 + y0
/4 − y0
/100 + y0
/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0/ 12) mod 7
 * 
 * 
 * */

package day6;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year=y month=m day=d");
		int y=sc.nextInt();
		int m=sc.nextInt();
		int d=sc.nextInt();
		int day=dayOfWeek(y,m,d);
		switch(day) {
		case 0:System.out.println("SUNDAY");
				break;
		case 1:System.out.println("MONDAY");
				break;
		case 2:System.out.println("TUESDAY");
				break;
		case 3:System.out.println("WEDNESDAY");
				break;
		case 4:System.out.println("THURSDAY");
				break;
		case 5:System.out.println("FRIDAY");
				break;
		case 6:System.out.println("SATURDAY");
				break;
		default :System.out.println("you gave wrong date");
		}

	}
	public static int dayOfWeek(int y,int m,int d) {
		int y0=y-(14-m)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=m+12*((14-m)/12)-2;
		int d0=(d+x+31*m0/12)%7;
		return d0;
	}

}
