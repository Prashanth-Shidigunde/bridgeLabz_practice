package day5;
import java.util.*;

public class Swap2Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number to be swapped");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swap = "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap = "+a+" "+b);

	}

}
