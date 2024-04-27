/*
 * 5.11 (Find the Smallest Value) Write an application that finds the smallest of several integers. 
 * Assume that the first value read specifies the number of values to input from the user.
 * 
 *  // Fig. 5.5: Sum.java 
 */

import java.util.Scanner;

public class Chap5_ex511 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number of integers: ");
    int num = input.nextInt();

    System.out.println("Enter the first integer value: ");
    int smallest = input.nextInt();

    for (int i = 2; i <= num; i++) {
    System.out.printf("Enter value #%d: ", i);
    int num1 = input.nextInt();

    if (num1 < smallest) { 
    smallest = num1;

    }
}
    System.out.println("The smallest value is: " + smallest);

    input.close();
    }
}
