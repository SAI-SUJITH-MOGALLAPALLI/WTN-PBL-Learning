package OopsAndInheritence.ClassesAndObjects.ClassesAndObjects1;

public class Box {
	double width,height,depth;
	Box(double width,double height,double depth){
		this.depth=depth;
		this.height=height;
		this.width=width;
	}
	double volume() {
		return depth*height*width;
	}
}
