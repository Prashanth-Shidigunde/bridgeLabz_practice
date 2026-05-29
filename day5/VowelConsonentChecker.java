package day5;

import java.util.Scanner;

public class VowelConsonentChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a letter");
		char c=sc.next().charAt(0);
		if("aeiouAEIOU".indexOf(c)!=-1) {
			System.out.println("Letter is Vowel");
		}
		else {
			System.out.println("Letter is consonent");
		}

	}

}
