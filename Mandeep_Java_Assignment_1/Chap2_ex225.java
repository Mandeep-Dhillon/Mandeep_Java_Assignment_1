
/*
 * 2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even. 
 * [Hint: Use the remainder operator. An even number is a multiple of 2. 
 * Any multiple of 2 leaves a remainder of 0 when divided by 2.]
 * 
 * import java.util.Scanner;
*/

 import java.util.Scanner;

 class Chap2_ex225 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the integer:");
    int number = input.nextInt();

    // print the even or odd number 
    if (number % 2 == 0) {
        System.out.printf("The even number: %d\n", + number);
    } else {
        System.out.printf("The odd number: %d\n", + number);
    }
    
    input.close();

  } // main()
 } // class