package day5;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("x and y values");
		int x=sc.nextInt();
		int y=sc.nextInt();
		double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
		System.out.println("Euclidean distance from the point (x, y) to the origin (0, 0)= "+distance);

	}

}
