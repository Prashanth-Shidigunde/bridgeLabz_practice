package day2;
import java.util.*;
class SpringSeason {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	//m is month and d is date month shoud between march and june,
        int m = sc.nextInt();
        int d = sc.nextInt();
        boolean result =
                (m == 3 && d >= 20) ||
                (m == 4) ||
                (m == 5) ||
                (m == 6 && d <= 20);

        System.out.println(result);

    }

}