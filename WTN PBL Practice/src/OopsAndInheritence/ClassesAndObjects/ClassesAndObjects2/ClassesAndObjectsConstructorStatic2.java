package OopsAndInheritence.ClassesAndObjects.ClassesAndObjects2;

public class ClassesAndObjectsConstructorStatic2 {
	public static void main(String[] args) {
		System.out.println(Calculator.powerInt(4,4));
		System.out.println(Calculator.powerDouble(4.9,5));
	}
}

/*
Create a new class called Calculator with the following methods: 
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.
*/