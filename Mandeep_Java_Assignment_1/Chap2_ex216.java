
/*
 * Complete the following exercises from your textbook (committing your changes regularly): 

Ch.2: Exercise: _____ (Available: 2.14-2.18, 2.24-2.35) 

Ch.3: Exercise: _____ (Available: 3.12-3.17) 

Ch.4: Exercise: _____ (Available 4.17-4.26, 4.30-4.34, 4.36-4.40) 

Ch.5: Exercise: _____ (Available 5.11-5.29) 

2.16 (Comparing Integers) Write an application that asks the user to enter two integers, 
obtains them from the user and displays the larger number followed by the words "is larger". 
If the numbers are equal, print the message "These numbers are equal". 
 */

 import java.util.Scanner;

 class Chap2_ex216 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first integer:");
    int num1 = input.nextInt();

    System.out.println("Enter the second integer:");
    int num2 = input.nextInt();

    // print the equal number 
    if (num1 == num2) {
        System.out.println("These numbers are equal.");
    } else {
        // Print the larger number 
        if (num1 > num2) {
            System.out.printf("%d is larger.\n", num1);
        } else {
            System.out.printf("%d is larger.\n", num2);
        }
    }
    
    input.close();

  } // main()
 } // class