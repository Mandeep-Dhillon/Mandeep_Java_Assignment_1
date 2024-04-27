
/*
 * Write an application that reads two integers, determines whether the first is a multiple of the second and 
 * prints the result. [Hint: Use the remainder operator.]
 
 */

 import java.util.Scanner;

 class Chap2_ex226 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first integer:");
    int num1 = input.nextInt();

    System.out.println("Enter the second integer:");
    int num2 = input.nextInt();

    if (num2 != 0 && num1 % num2 == 0) {
        System.out.printf(num1 + " a multiple of %d\n " + num2);
    } else {
        System.out.println(num1 + " is not a multiple of " + num2);
    }
    
    input.close();

  } // main()
 } // class