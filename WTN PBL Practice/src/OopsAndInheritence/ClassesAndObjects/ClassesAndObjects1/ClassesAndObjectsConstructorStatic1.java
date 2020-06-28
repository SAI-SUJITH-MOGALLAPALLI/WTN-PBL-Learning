package OopsAndInheritence.ClassesAndObjects.ClassesAndObjects1;

public class ClassesAndObjectsConstructorStatic1 {
	public static void main(String[] args) {
		double width=3.0;
		double height=5.5;
		double depth=6.5;
		Box b=new Box(width,height,depth);
		System.out.println(b.volume());
	}
}
/*
Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box.
 Create an object of the Box class and test the functionalities.
*/