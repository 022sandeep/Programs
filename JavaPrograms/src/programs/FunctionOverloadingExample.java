package programs;
class Rectangle
{
	double l,b;
	
	void getRectangle()
	{
		l=12.5;
		b=3.4;
	}
	void getRectangle(double p)
	{
		l=p;
		b=p;
	}
	void getRectangle(double p,double q)
	{
		l=p;
		b=q;
	}
	
	void display()
	{
		System.out.println("Area of rectangle is:"+l*b);
		
	}
	
}

public class FunctionOverloadingExample {

	public static void main(String[] args)
	{
		Rectangle obj1=new Rectangle();
		obj1.getRectangle();
		obj1.display();
		Rectangle obj2=new Rectangle();
		obj2.getRectangle(3.7);
		obj2.display();
		Rectangle obj3=new Rectangle();
		obj3.getRectangle(30.7,4.6);
		obj3.display();
		

	}

}
