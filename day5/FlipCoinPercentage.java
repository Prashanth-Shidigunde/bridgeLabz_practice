package day5;
import java.util.*;

public class FlipCoinPercentage {

	public static void main(String[] args) {
		 int head=0;
		 int tail=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number of flip");
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("Enter positive Integer");
			return;
		}
		for(int i=1;i<=n;i++) {
			int coin=(int)(Math.random()*2);
			if(coin==0) {
				head++;
			}
			else {
				tail++;
			}
		}
		double headPercentage=(head*100.0)/n;
		double tailPercentage=(tail*100.0)/n;
		System.out.println("Head percentge is ="+headPercentage);
		System.out.println("Tail percentage is ="+tailPercentage);
		

	}

}
