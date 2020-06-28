package OopsAndInheritence.OverridingAndPolymorphism.InheritenceAndOverriding1;

public class MainClass {

	public static void main(String[] args) {
		Apple apple=new Apple();
		apple.eat();
		Orange orange=new Orange();
		orange.eat();
	}

}

/*
Create  a base class Fruit with name ,taste and size as its attributes. 

Create a method called eat() which describes the name of the fruit and its taste. 

Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
*/