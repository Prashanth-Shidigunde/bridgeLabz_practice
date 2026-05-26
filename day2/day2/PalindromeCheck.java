package day2;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int original = n;
		int rev=0;
		for(;n>0;n/=10) {
			int digit=n%10;
			rev=rev*10+digit;
		}
		if(original == rev) {
			System.out.println(original+" is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

	}

}
