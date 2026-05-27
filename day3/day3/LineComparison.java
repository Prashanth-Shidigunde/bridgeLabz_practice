package day3;
import java.util.*;

public class LineComparison {

    public static void main(String[] args) {

    		Scanner sc=new Scanner(System.in);
    		System.out.println("x1 x2 y1 y2");
    		int x1=sc.nextInt();
    		int x2=sc.nextInt();
    		int y1=sc.nextInt();
    		int y2=sc.nextInt();

        double length;

        length = Math.sqrt(
                    Math.pow((x2 - x1), 2) +
                    Math.pow((y2 - y1), 2)
                 );

        System.out.println("Length of the Line = " + length);
    }
}