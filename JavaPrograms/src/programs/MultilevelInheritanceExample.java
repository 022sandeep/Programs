package programs;
class A
{
	int x;
}
class B extends A
{
	int y;
}
class C extends B
{
	int z;
	void getxyz(int p,int q,int r)
	{
	 x=p;
	 y=q;
	 z=r;
	}
	void putxyz()
	{
		System.out.println("x="+x+" y="+y+" z="+z);
	}	
}
public class MultilevelInheritanceExample {

	public static void main(String[] args)
	{
		C obj=new C();
		obj.getxyz(10, 20, 30);
		obj.putxyz();
	}

}
