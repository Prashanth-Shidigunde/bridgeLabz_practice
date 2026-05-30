package day6;
import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int n=sc.nextInt();
		if(n<=1) {
			System.out.println("Number is not prime number");
			return;
		}
		if(n==2) {
			System.out.println("Number is prime number");
			return;
		}
		for(int i=3;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println("Number is not prime");
				return;
			}
		}
		System.out.println("Number is prime number");

	}

}
