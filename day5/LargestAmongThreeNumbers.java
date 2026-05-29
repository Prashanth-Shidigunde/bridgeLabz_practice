package day5;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a b c number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c){
			System.out.println("a is greater than b c");
		}
		else if(b>c) {
			System.out.println("b is greater than ac ");
		}
		else {
			System.out.println("c is greater than ab");
		}

	}

}
