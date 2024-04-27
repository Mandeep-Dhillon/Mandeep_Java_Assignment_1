
/*/
4.21 (Find the Largest Number) The process of finding the largest value is used frequently in computer applications. 
For example, a program that determines the winner of a sales contest would input the number of units sold by each salesperson.
 The salesperson who sells the most units wins the contest. Write a pseudocode program, 
 then a Java application that inputs a series of 10 integers and determines and prints the largest integer. 
 Your program should use at least the following three variables:

counter: A counter to count to 10 (i.e., to keep track of how many numbers have been input and to determine 
when all 10 numbers have been processed).

number: The integer most recently input by the user.

largest: The largest number found so far.
*/

/*Pseudocode:
1. Initialize counter to 1
2. Initialize largest to the first number input by the user
3. While counter is less than or equal to 10, do the following:
     a. Prompt the user to input an integer (number)
     b. If number is greater than largest, update largest to number
     c. Increment counter by 1
4. Print the largest number found
*/


import java.util.Scanner;

public class Chap4_ex421 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int counter = 1; // Initialize counter
int largest = 0; // Initialize largest

    while (counter <= 10) {
    System.out.printf("Enter integer %d\n: ", counter);
    int number = input.nextInt();

    if (counter == 1 || number > largest) {
    largest = number; // Update largest if number is greater
    }

    counter++; // Increment counter
    }

    System.out.printf("The largest number is: %d\n", largest);

    input.close();

    }
}
