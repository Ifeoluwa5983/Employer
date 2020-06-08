package classwork;

public class EmployerTest {

	public static void main(String[] args) {
          Employer obj1 = new Employer("Oluwafemi", "Ifeoluwa", 3.5);
          System.out.printf("Your firstname is %s%n", obj1.getFirstName());
          System.out.printf("Your lastname is%s%n", obj1.getLastName());
          System.out.printf("Your monthly salary is %f%n",obj1.getSalary());
          System.out.println(obj1.getMonthlySalary());
          System.out.println(obj1.getYearlySalary());

	}

}
