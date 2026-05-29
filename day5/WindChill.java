package day5;

import java.util.Scanner;

/*Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be:
windchil = 35.74+ (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16);

Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).
*/
public class WindChill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter t and v in float format");
		double t=sc.nextDouble();
		double v=sc.nextDouble();
		if (Math.abs(t) > 50 || v < 3 || v > 120) {
		    System.out.println("Invalid input range.");
		    return;
		}
		double windChill =35.74+ (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16);
		System.out.println("WindChil = "+windChill);
	}
}
