/*
 * Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
 * 
 * 
 * 
 * */
package day5;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a b c value to finde quadratic roots");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==0) {
			System.out.println("a cannot be zero");
			return;
		}
		
		double delta=(b*b)-(4*a*c);
		if (delta < 0) {
		    System.out.println("Roots are imaginary (no real roots)");
		    return;
		} 
		double r1=(-b+Math.sqrt(delta))/(2*a);
		double r2=(-b-Math.sqrt(delta))/(2*a);
		
		System.out.println("root1 = "+r1);
		System.out.println("root2 = "+r2);
		

	}

}
