/*
 * 5.12 (Calculating the Product of Odd Integers) Write an application that calculates the product of 
 * the odd integers from 1 to 15.
 */

 import java.util.Scanner;

public class Chap5_ex512 {
public static void main(String[] args) {
    // Initialize the num to 1
    int num = 1;

    // Multiply num by each odd number from 1 to 15
    for (int i = 1; i <= 15; i++) {
        if (i % 2 != 0) {
        num *= i;
    }
}

// Print the result
System.out.printf("The product of the odd integers from 1 to 15 is: %d\n", num);
 }
}
