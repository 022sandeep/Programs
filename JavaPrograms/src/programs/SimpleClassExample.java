package programs;

class SampleClassExample1
{
	int x,y;
	
	void getData(int p,int q)
	{
	  x=p;
	  y=q;
	}
	
	void putData()
	{
		System.out.println("x="+x+" y="+y);
	}
	
}

public class SimpleClassExample 
{

	public static void main(String[] args) 
	{
		SampleClassExample1 obj=new SampleClassExample1();
		obj.getData(10, 20);
		obj.putData();

	}

}
