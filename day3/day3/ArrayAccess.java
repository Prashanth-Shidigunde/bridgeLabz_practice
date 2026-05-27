package day3;
import java.util.*;
public class ArrayAccess {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int n= sc.nextInt();
		int[] ar=new int[n];
		//insertElement
		insert(ar);
		//displayElement
		display(ar);
		//LargestElement
		largestElement(ar);
		//Smallest Element
		smallestElement(ar);
		//EvenPositionPrint
		evenPositionPrint(ar);
		//Element frequency
		frequency(ar);
		//reverse array
		reverseArray(ar);
		//oddposition
		oddPosition(ar);
		//duplicate elements
		duplicate(ar);
		//ascending
		ascend(ar);
		//2nd largest element
		secondLargestElement(ar);
		
		
	}
	public static void secondLargestElement(int[] ar) {
		int first,second;
		if(ar[0]>ar[1]) {
			first=ar[0];
			second=ar[1];
		}
		else {
			first=ar[1];
			second=ar[0];
		}
		for(int i=2;i<ar.length;i++) {
			if(ar[i]>first) {
				second=first;
				first=ar[i];
			}
			else if(second>ar[i] && ar[i]!=first) {
				second=ar[i];
			}
		}
		System.out.println("Second largest element is = "+second);
		
	}
	//insert element
	public static void insert(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
	}
	//frequencyOfElement
	public static void frequency(int[] ar) {
		boolean[] point = new boolean[ar.length];
		int count;
		System.out.println("Frequency count:");
		for(int i=0;i<ar.length;i++) {
			count=1;
			if(point[i]==false) {
			for(int j=i+1;j<ar.length;j++) {
					if(ar[i]==ar[j]) {
						count++;
						point[j]=true;
					}
				}
			System.out.print(ar[i]+"="+count+",");
			}
		}	
		System.out.println();
	}
	//display element
	public static void display(int[] ar) {
		for(int a:ar) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	//largestelement
	public static void largestElement(int[] ar) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println("Largest Element= "+max);
	}
	//smallest Element
	public static void smallestElement(int[] ar) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		System.out.println("Largest Element= "+min);
	}
	//even positio print
	public static void evenPositionPrint(int[] ar) {
		System.out.println("Even Position= ");
		for(int i=0;i<ar.length;i+=2) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	//reverse an array
	public static void reverseArray(int[] ar) {
		System.out.println("ReverseArray: ");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	//odd position print
	public static void oddPosition(int[] ar) {
		System.out.println("Odd position print");
		for(int i=1;i<ar.length;i+=2) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	//duplicate element
	public static void duplicate(int ar[]) {
		System.out.println("duplicate element print");
		int count;
		boolean[] point=new boolean[ar.length];
		for(int i=0;i<ar.length;i++) {
			count=1;
			if(point[i]==false) {
				for(int j=i+1;j<ar.length;j++){
					if(ar[i]==ar[j]) {
						count++;
						point[j]=true;
					}
				}
			}
			if(count>1) {
				System.out.print(ar[i]+" ");
			}
		}
		System.out.println();
	}
	//sort array in ascending
	public static void ascend(int[] ar) {
		int min;
		System.out.println("Ascending order");
		for(int i=0;i<ar.length;i++) {
			min=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[min]) {
					min=j;
				}
			}
			int temp=ar[i];
			ar[i]=ar[min];
			ar[min]=temp;
		}
		display(ar);
		System.out.println();
	}
	

}
