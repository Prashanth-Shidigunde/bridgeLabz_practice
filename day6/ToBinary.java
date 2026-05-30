package day6;

import java.util.Scanner;

/*Write a static function toBinary that outputs the binary (base 2) representation of
the decimal number typed as the input. It is based on decomposing the number into
a sum of powers of 2. For example, the binary representation of 106 is 11010102,
which is the same as saying that 106 = 64 + 32 + 8 + 2. Ensure necessary padding
to represent 4 Byte String.
To compute the binary representation of n, we consider the powers of 2 less than or
equal to n in decreasing order to determine which belong in the binary
decomposition (and therefore correspond to a 1 bit in the binary representation).*/

public class ToBinary {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		System.out.println(n+" ="+toBinary(n));
		
		
	}

	public static String toBinary(int n) {
		
		String binary= "";
		for(int i=8;i>=0;i--) {
			int bite=(n>>i) &1;
			binary+=bite;
		}
		return binary;
	}
}
