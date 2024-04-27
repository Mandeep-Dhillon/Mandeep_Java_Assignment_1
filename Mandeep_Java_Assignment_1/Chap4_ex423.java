/*
 * 4.23 (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21,
 *  find the two largest values of the 10 values entered. [Note: You may input each number only once.]
 */

 import java.util.Scanner;

 class Chap4_ex423 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int counter = 1;
    int largest1 = Integer.MIN_VALUE; // Initialize largest1 to the smallest possible integer value
    int largest2 = Integer.MIN_VALUE; // Initialize largest2 to the smallest possible integer value

    
    while (counter <= 10) {
        System.out.printf("Enter integer %d\n: ", counter);
        int number = input.nextInt();

        if (number > largest1) {
            largest2 = largest1; // Move the current largest1 to largest2
            largest1 = number;   // Update largest1 with the new number
        } else if (number > largest2) {
            largest2 = number;   // Update largest2 with the new number
        }

    counter++;
    }

    System.out.printf("The largest number is: %d\n", largest1);
    System.out.printf("The second largest number is: %d\n", largest2);

    input.close();

  } // main()
 } // class