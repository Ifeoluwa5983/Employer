package classwork;

public class Employer {
       private String firstName;
       private String lastName;
       private double salary;
       
       
       public Employer(String firstName, String lastName, double salary){
    	   this.firstName = firstName;
    	   this.lastName = lastName;
    	   this.salary = salary;
       }
       public void setFirstName(String firstName) {
    	   this.firstName = firstName;
       }
       public String getFirstName() {
    	   return firstName;
       }
       public void setLastName(String lastName) {
    	   this.lastName = lastName;
       }
       public String getLastName() {
    	   return lastName;
       }
       public void setSalary(double salary) {
    	   this.salary = salary;
       }
       public double getSalary() {
    	   return salary;
       }
       public double getMonthlySalary() {
    	   if(salary > 0.0) {
    		    salary = salary/100 * 10;
    	   }
    	   return salary;
       }
       public double getYearlySalary() {
    	  double yearlySalary = salary * 12;
    	        return yearlySalary;
       }
     	   
}
       