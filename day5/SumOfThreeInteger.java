package day5;

import java.util.Scanner;

public class SumOfThreeInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int count=0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-2;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				for(int k=i+2;k<a.length;k++) {
					if(a[i]+a[j]+a[k]==0) {
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						count++;
					}
				}
			}
		}
		System.out.println("Number of Triplets = " + count);

	}

}
