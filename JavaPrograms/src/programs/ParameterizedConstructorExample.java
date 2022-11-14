package programs;

class ParameterizedConstructor
{
	int x,y;
	
	
	ParameterizedConstructor(int p,int q) //Parametrized Constructor
	{
		x=p;
		y=q;
	}
	void display()
	{
		System.out.println("x="+x+" y="+y);
	
	}	
}


public class ParameterizedConstructorExample {

	public static void main(String[] args)
	{
		ParameterizedConstructor obj=new ParameterizedConstructor(120,140);
		obj.display();
	}

}
