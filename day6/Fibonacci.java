package day6;

import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of series need");
		int n=sc.nextInt();
		System.out.println("Fibonacci series");
		int a=0,b=1,c;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
	}

}
