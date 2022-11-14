package programs;

class Base1
{
	int x;	
}

class Derived1 extends Base1
{
	int y;
	
	void getxy(int p,int q)
	{
		x=p;
		y=q;
	}
	
	void display()
	{
		System.out.println("x="+x+"  y="+y);
	}
}
public class SingleInheritanceExample1 
{
	public static void main(String[] args) {
		Derived1 obj=new Derived1();
		obj.getxy(10,20);
		obj.display();

	}

}
