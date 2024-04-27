
/*
 * 2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the user and displays the sum,
 *  average, product, smallest and largest of the numbers. Use the techniques shown in Fig. 2.15. 
 * [Note: The calculation of the average in this exercise should result in an integer representation of the average. 
 * So, if the sum of the values is 7, the average should be 2, not 2.3333….]
 */

 import java.util.Scanner;

 class Chap2_ex217 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first integer:");
    int num1 = input.nextInt();

    System.out.println("Enter the second integer:");
    int num2 = input.nextInt();

    System.out.println("Enter the third integer:");
    int num3 = input.nextInt();

    int sum = num1 + num2 + num3;

    int average = sum / 3;

    int smallestNumber;

    if (num1 <= num2 && num1 <= num3) {
        smallestNumber = num1;
    } else if (num2 <= num1 && num2 <= num3) {
        smallestNumber = num2;
    } else {
        smallestNumber = num3;
    }

    int largestNumber;

    if (num1 >= num2 && num1 >= num3) {
        largestNumber = num1;
    } else if (num2 >= num1 && num2 >= num3) {
        largestNumber = num2;
    } else {
        largestNumber = num3;
    }

    // print the sum, product, average 
    System.out.printf("The sum: %d\n", sum);
    System.out.printf("The product: %d\n", num1 * num2 * num3);
    System.out.printf("The average: %d\n", + average);

    // print the smallest and largest number 
    System.out.printf("The smallest number: %d\n", + smallestNumber);
    System.out.printf("The largest number: %d\n", + largestNumber);

    
    input.close();

  } // main()
 } // class