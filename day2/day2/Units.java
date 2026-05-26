package day2;

import java.util.Scanner;

public class Units{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        switch(num) {
            case 1:
                System.out.println("Unit");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 100:
                System.out.println("Hundred");
                break;
            case 1000:
                System.out.println("Thousand");
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

}