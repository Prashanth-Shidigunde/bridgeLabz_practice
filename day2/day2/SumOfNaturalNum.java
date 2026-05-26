package day2;
import java.util.*;

public class SumOfNaturalNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		//with while loop 
		int i=1;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("Sum of natural numbers: "+sum);
	}
}
