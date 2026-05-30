/*Simulate Stopwatch Program
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.
 * 
 * */

package day6;

import java.util.Scanner;

public class SimulateStopWatch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Press Enter to start StopWatch");
	sc.nextLine();
	long start=System.currentTimeMillis();
	System.out.println(start);
	System.out.println("Press Enter to end stopwatch");
	sc.nextLine();
	long end=System.currentTimeMillis();
	System.out.println(end);
	System.out.println("Elapsed between start and end = "+(end-start));
	
	
}
}
