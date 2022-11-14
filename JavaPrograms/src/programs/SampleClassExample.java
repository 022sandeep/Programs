package programs;


class Sample
{
	int a;
	
	
	 boolean getData(int p)
	{
		a=p;
		return(true);
	}
	
	void display()
	{
		System.out.println("a="+  getData(5));
		
	}
	
	
}



public class SampleClassExample 
{
	public static void main(String[] args)
	{
		Sample obj=new Sample(); //object			
		
		obj.display();

	}

}
