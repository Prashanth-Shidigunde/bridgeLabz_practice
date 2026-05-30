package day6;

/*c=0-100c
 * f=32-212
 * daily range
 * 
 * */
import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you want to convert in Celsius or fahrenheit (1,2) ");
		int n=sc.nextInt();
		if(n==1) {
			System.out.println("Enter in fahrenheit");
			int f=sc.nextInt();
			System.out.println(f+"F ="+Celsius(f)+"C");
		}
		else {
			System.out.println("Enter in Celcius");
			int c=sc.nextInt();
			System.out.println(c+"C ="+Faherenheit(c)+"F");
		}

	}

	public static double Celsius(int f) {
		return (f-32)*5/9;
	}
	public static double Faherenheit(int c) {
		return (c*9/5)+32;
	}

}
