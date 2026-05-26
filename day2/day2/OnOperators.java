package day2;
import java.util.*;
public class OnOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int sum1=(a+b*c);
		int sum2=(c+a/b);
		int sum3=(a%b+c);
		int sum4=(a*b+c);
		System.out.println("a+b*c = "+sum1);
		System.out.println("c+a/b = "+sum2);
		System.out.println("a%b+c = "+sum3);
		System.out.println("a*b+c = "+sum4);
		
		if((sum1>sum2)&&(sum1>sum3)&&(sum1>sum4)) {
			System.out.println("max="+sum1);
		}
		else if((sum2>sum3)&&(sum2>sum4)) {
			System.out.println("max="+sum2);
		}
		else if(sum3>sum4) {
			System.out.println("max="+sum3);
		}
		else {
			System.out.println("Max="+sum4);
		}
		if((sum1<sum2)&&(sum1<sum3)&&(sum1<sum4)) {
			System.out.println("min="+sum1);
		}
		else if((sum2<sum3)&&(sum2<sum4)) {
			System.out.println("min="+sum2);
		}
		else if(sum3<sum4) {
			System.out.println("min="+sum3);
		}
		else {
			System.out.println("Min="+sum4);
		}

	}

}
