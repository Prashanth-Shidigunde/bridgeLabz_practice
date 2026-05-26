package day2;

import java.util.Scanner;

public class VowelChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  single letter and i.e only alphabet");
		char s=sc.next().charAt(0);
		switch(s) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Vowel");
			break;
		default : 
			System.out.println("Consonent");
		}
	
		
		

	}

}
