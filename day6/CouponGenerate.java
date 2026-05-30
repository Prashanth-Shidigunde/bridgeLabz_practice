/*
 * Coupon Numbers
a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
need to generate a distinct coupon number? This program simulates this random
process.
b. I/P -> N Distinct Coupon Number
c. Logic -> repeatedly choose a random number and check whether it's a new one.
d. O/P -> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random numbers and to
process distinct coupons.*/

package day6;

import java.util.Scanner;

public class CouponGenerate {
	public static double generateCoupon(int n) {
		return Math.random()*n;
	}
	public static void collectionCoupon(int n) {
		boolean[] b=new boolean[n];
		int couponcount=0;
		int totalGen=0;
		while(couponcount<n) {
			int cgen=(int)generateCoupon(n);
			totalGen++;
			if(!b[cgen]) {
				b[cgen]=true;
				couponcount++;
			}
		}
		System.out.println("Total generate ="+totalGen);
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of distinct coupon need");
		int n=sc.nextInt();
		collectionCoupon(n);

	}

}
