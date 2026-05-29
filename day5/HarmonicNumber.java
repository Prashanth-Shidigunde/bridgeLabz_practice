package day5;
//sum of the reciprocal of the first n possitive
import java.util.*;
public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Harmonic Value : ");
		int n=sc.nextInt();
		double res=0.0;
		if(n==0) {
			System.out.println("Enter Valid Number because denominator cannot be zero");
			return;
		}
		for(int i=1;i<=n;i++) {
			 res+=(1.0/i);
		}
		System.out.println("Harmonic result ="+res);
		

	}

}
