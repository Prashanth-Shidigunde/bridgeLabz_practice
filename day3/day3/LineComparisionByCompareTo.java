package day3;

import java.util.Scanner;

public class LineComparisionByCompareTo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("x1,x2,x3,x4,y1,y2,y3,y4");
		int x1,x2,x3,x4,y1,y2,y3,y4;
		x1=sc.nextInt();
		x2=sc.nextInt();
		x3=sc.nextInt();
		x4=sc.nextInt();
		y1=sc.nextInt();
		y2=sc.nextInt();
		y3=sc.nextInt();
		y4=sc.nextInt();
		Double length1=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		Double length2=Math.sqrt(Math.pow((x4-x3), 2)+Math.pow((y4-y3), 2));
		
		System.out.println("Display length1 = "+length1);
		System.out.println("Display length2 = "+length2);
		if(length1.compareTo(length2) == 0) {
			System.out.println("Lengths are same:");
		}
		else if(length1.compareTo(length2)<0) {
			System.out.println("length1<length2");;
		}
		else {
			System.out.println("length1>length2");
		}

	}

}
