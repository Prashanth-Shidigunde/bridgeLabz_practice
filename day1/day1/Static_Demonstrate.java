package day1;

public class Static_Demonstrate {
	static int a;
	static {

        a = 100;
        System.out.println("Static Block Executed");

    }
	static void display() {
		 System.out.println("Static Method");
	     System.out.println("Value of a = " + a);
	}

	public static void main(String[] args) {
		display();

	}

}
