package programs;

interface Circle
{
	static final double pi=3.14;
	void displayArea();	
}

class CircleArea implements Circle
{
	double radius;
	
	void getData(double r)
	{
		radius=r;
	}
	
	public void displayArea()
	{
		System.out.println("Area of circle is:"+pi*radius*radius);
	}
	
}

public class InterfaceExample1 {

	public static void main(String[] args) 
	{
		CircleArea obj=new CircleArea();
		obj.getData(2.5);
		obj.displayArea();

	}

}
