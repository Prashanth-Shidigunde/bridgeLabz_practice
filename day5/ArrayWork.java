package day5;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArrayWork {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out),true);
		System.out.println("Enter number of rows");
		int m=sc.nextInt();
		System.out.println("Enter number of columns");
		int n=sc.nextInt();
		int[][] ar=new int[m][n];
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				pw.print(ar[i][j]+" ");
			}
			pw.println();
		}
		

	}

}
