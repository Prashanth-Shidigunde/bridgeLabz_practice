package day1;
public class CommandLineArg {

	public static void main(String[] args) {
		int sum=0;
		int invalidCount = 0;
		for(String value:args) {
			try {
				int num=Integer.parseInt(value);
				sum+=num;
			}
			catch(NumberFormatException e) {
				invalidCount++;
			}
		}
		System.out.println("Sum of valid arg :"+sum);
		System.out.println("Invalid number count: "+invalidCount);

	}

}
