
/*
 *  * Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. 
 * Create two Employee objects and display each object’s yearly salary. 
 * Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 * import java.util.Scanner;
 */
import java.util.Scanner;

public class Chap3_ex313Test {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    

    // Prompt the user to enter the details for employee1
    System.out.println("Enter the first employee's first name:");
    String firstName1 = input.next();
    System.out.println("Enter the first employee's last name:");
    String lastName1 = input.next();
    System.out.println("Enter the first employee's monthly salary:");
    double salary1 = input.nextDouble();

    // Prompt the user to enter the details for employee2
    System.out.println("Enter the second employee's first name:");
    String firstName2 = input.next();
    System.out.println("Enter the second employee's last name:");
    String lastName2 = input.next();
    System.out.println("Enter the second employee's monthly salary:");
    double salary2 = input.nextDouble();

    // Create two Employee objects based on user input
    Employee employee1 = new Employee(firstName1, lastName1, salary1);
    Employee employee2 = new Employee(firstName2, lastName2, salary2);

    // Display yearly salary for each employee
    System.out.println("Yearly salary for " + employee1.getFirstName() + " " + employee1.getLastName() +
        ": $" + employee1.getYearlySalary());
    System.out.println("Yearly salary for " + employee2.getFirstName() + " " + employee2.getLastName() +
        ": $" + employee2.getYearlySalary());

    // Give each employee a 10% raise
    employee1.raise();
    employee2.raise();

    // Display yearly salary for each employee after raise
    System.out.println("\nAfter 10% raise:");
    System.out.println("Yearly salary for " + employee1.getFirstName() + " " + employee1.getLastName() +
        ": $" + employee1.getYearlySalary());
    System.out.println("Yearly salary for " + employee2.getFirstName() + " " + employee2.getLastName() +
        ": $" + employee2.getYearlySalary());

    input.close();
    }

}



