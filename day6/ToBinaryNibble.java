package day6;

import java.util.Scanner;

/*Write Binary.java to read an integer as an Input, convert to Binary using toBinary
function and perform the following functions.
i. Swap nibbles and find the new number.
ii. Find the resultant number is the number is a power of 2.
A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte.
Given a byte, swap the two nibbles in it. For example 100 is to be represented as
01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100). If we swap the
two nibbles, we get 01000110 which is 70 in decimal.*/
public class ToBinaryNibble {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int n=scanner.nextInt();
		//toggle and swapped formula
		int first=n/16;
		int second=n%16;
		int swapped=second*16+first;
		System.out.println("After swapped "+swapped);
		int temp=swapped;
		while(temp>0 && temp%2==0) {
			temp/=2;
		}
		if(temp==1) {
			System.out.println("number is power of 2");
		}
		else {
			System.out.println("number is not power of 2");
		}

	}

}
