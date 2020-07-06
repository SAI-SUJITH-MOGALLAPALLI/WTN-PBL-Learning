package AbstractionAndPackagesAndExceptionHandling.Abstraction.AbstractClasses1;

import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] compartment=new Compartment[10];
		Random rand=new Random();
		for(int i=0;i<10;i++) {
			int random_number=rand.nextInt(4);
			if(random_number==0) {
				compartment[i]=new FirstClass();
				System.out.println(compartment[i].notice());
			}
			else if(random_number==1) {
				compartment[i]=new Ladies();
				System.out.println(compartment[i].notice());
			}
			else if(random_number==2) {
				compartment[i]=new General();
				System.out.println(compartment[i].notice());
			}
			else if(random_number==3) {
				compartment[i]=new Luggage();
				System.out.println(compartment[i].notice());
			}
		}
	}

}
/*
  Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. 

public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.

Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]

*/