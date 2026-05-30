package day6;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int n=sc.nextInt();
		System.out.println("Before reverse ="+n);

		int rev=0;
		while(n>0) {
			int digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}
		System.out.println("after reverse number is ="+rev);

	}

}
