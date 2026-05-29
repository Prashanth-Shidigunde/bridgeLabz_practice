package day5;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter power value N");
		int n=sc.nextInt();
		int res=1;
		if(n<0 || n>31) {
			System.out.println("please enter number between 0 to  30 ");
			return;
		}
		for(int i=0;i<=n;i++) {
			System.out.println("2 ^ "+i+" = "+res);
			res*=2;
		}

	}

}
