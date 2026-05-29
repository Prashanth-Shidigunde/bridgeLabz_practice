package day5;
import java.util.*;

public class QuotientAndReminder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend and divisor");
		int dividend=sc.nextInt();
		int divisor=sc.nextInt();
		System.out.println("Quotient is "+dividend/divisor);
		System.out.println("Reminder is "+dividend%divisor);

	}

}
