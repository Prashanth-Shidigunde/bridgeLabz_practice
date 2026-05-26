package day2;
import java.util.Scanner;

public class SumOfNumUsingFOr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		//with for loop 
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum of natural numbers: "+sum);
	}

}
