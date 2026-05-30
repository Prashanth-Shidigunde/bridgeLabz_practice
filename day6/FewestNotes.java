package day6;
/*Find the Fewest Notes to be returned for Vending Machine
a. Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
returned by Vending Machine. Write a Program to calculate the minimum number
of Notes as well as the Notes to be returned by the Vending Machine as a
Change
b. I/P -> read the Change in Rs to be returned by the Vending Machine
c. Logic -> Use Recursion and check for largest value of the Note to return change
to get to the minimum number of Notes.
d. O/P -> Two Outputs - one the number of minimum Note needed to give the
change and second list of Rs Notes that would given in the Change*/

import java.util.Scanner;

public class FewestNotes {
	static int[] notes= {1000,500,100,50,10,5,2,1};

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rupees");
		int rupees=sc.nextInt();
		countNumbers(rupees,0);

	}

	public static void countNumbers(int rupees, int i) {
		if(rupees==0|| i>=notes.length){
			return;
		}
		int note=notes[i];
		int count=rupees/note;
		if(count>0) {
			System.out.println("rs."+note+" ="+count);
		}
		countNumbers(rupees%note,i+1);
	}

}
