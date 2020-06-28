package OopsAndInheritence.OverridingAndPolymorphism.InheritenceAndOverriding1;

public class Orange extends Fruit{
	void eat() {
		super.name="Orange";
		super.taste="Sour";
		super.size=3.0;
		super.eat();
	}
}
