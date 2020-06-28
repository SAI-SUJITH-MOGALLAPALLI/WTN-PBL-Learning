package OopsAndInheritence.Inheritance.Inheritance2;

public class Employee extends Person{
	double annual_salary;
	int year;
	String insurance_number;
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsurance_number() {
		return insurance_number;
	}
	public void setInsurance_number(String insurance_number) {
		this.insurance_number = insurance_number;
	}
}
