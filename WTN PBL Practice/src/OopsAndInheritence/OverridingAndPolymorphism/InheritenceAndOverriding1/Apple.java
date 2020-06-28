package OopsAndInheritence.OverridingAndPolymorphism.InheritenceAndOverriding1;

public class Apple extends Fruit{

	void eat() {
		super.name="Apple";
		super.taste="Sweet";
		super.size=2.0;
		super.eat();
	}

}
