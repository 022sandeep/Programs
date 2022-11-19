package programs;
class BaseClass1
{
	int x;
	void getData(int p)
	{
		x=p;
	}
	void display()
	{
		System.out.println("x="+x);
	}
	
}
class ChildClass1 extends BaseClass1
{
	int y;
	void getData(int p)
	{
		y=p;
	}
	void display()
	{
		System.out.println("y="+y);
	}
}

public class FunctionOverridingExample
{

	public static void main(String[] args) 
	{
		BaseClass1 obj=new BaseClass1();
		obj.getData(10);
		obj.display();
		
		obj=new ChildClass1();
		obj.getData(20);
		obj.display();
	}

}
