package OopsAndInheritence.Inheritance.Inheritance2;

public class TestEmployee {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setName("Sujith");
		employee.setAnnual_salary(25000.00);
		employee.setInsurance_number("170030811AB");
		employee.setYear(2000);
		System.out.println("Name:"+employee.getName());
		System.out.println("Annual Salary:"+employee.getAnnual_salary());
		System.out.println("Insurance Number:"+employee.getInsurance_number());
		System.out.println("Year Joined:"+employee.getYear());
	}
}
/*
Create a class called Person with a member variable name. Save it in a file called Person.java

Create a class called Employee that will inherit the Person class.The other data members of the Employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java

Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.
*/