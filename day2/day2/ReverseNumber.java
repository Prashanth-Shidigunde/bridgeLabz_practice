package day2;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number and dont enter last number zero");
		int n=sc.nextInt();
		int rev=0;
		while(n>0) {
			int digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}
		System.out.println("Reversed value: "+rev);

	}

}
