
/*
 * 3.13 (Employee Class) Create a class called Employee that includes three instance variables—a first name (type String), 
 * a last name (type String) and a monthly salary (double). 
 * Provide a constructor that initializes the three instance variables. 
 * Provide a set and a get method for each instance variable. If the monthly salary is not positive, do not set its value. 
 * Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. 
 * Create two Employee objects and display each object’s yearly salary. 
 * Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */

 class Employee {
    
    private String firstName; // instance variables
    private String lastName;
    private double monthlySalary; // default value of 0.0
  
    // constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
      this.firstName = firstName;
      this.lastName = lastName;
  
      if(monthlySalary > 0.0) {
        this.monthlySalary = monthlySalary;
      }
    } // contructor()
  
    //==============>>
    // Getters
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
  
    public double getmonthlySalary() {
      return this.monthlySalary;
    } // getSalary()
  
    //==============>>
    // Setters
    public void setfirstName(String firstName) { // void is NO return
      this.firstName = firstName;
    } // setName()
    public void setlastName(String lastName) { // void is NO return
        this.lastName = lastName;
      } // setName()
    
    public void setmonthlySalary(double salary) {
      if(salary > 0.0) {
        this.monthlySalary = salary;
      }
    } // setBalance()

    // Method to calculate and return yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give a 10% raise in monthly salary
    public void raise() {
        monthlySalary *= 1.1; // Increase monthly salary by 10%
    }
} // class