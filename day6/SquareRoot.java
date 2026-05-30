package day6;

import java.util.Scanner;

/*Write a static function sqrt to compute the square root of a nonnegative number c
given in the input using Newton's method:
- initialize t = c
- replace t with the average of c/t and t
- repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t
where epsilon = 1e-15;*/

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter c value");
		double c = sc.nextInt();
		double t=c;
		double epsilon =1e-15;
		while(Math.abs(t-c/t)>epsilon*t) {
			t=(t+c/t)/2.0;
		}
		System.out.println("square root of "+c+" is "+t);
	}

}
