package programs;
interface X
{
	void getData(int y);
}
interface Y
{
	void display();
}
class Z implements X,Y
{
	int x;
	public void getData(int y)
	{
	x=y;	
	}
	public void display()
	{
		System.out.println("Value of x:"+x);
	}
}
public class Interface {

	public static void main(String[] args) {
		Z obj=new Z();
		obj.getData(10);
		obj.display();

	}

}
