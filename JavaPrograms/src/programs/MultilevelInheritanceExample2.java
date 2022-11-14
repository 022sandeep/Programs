package programs;
class A1
{
	int x;
}
class B1 extends A1
{
	int y;
}
class C1 extends B1
{
	void getxy(int p,int q)
	{
		x=p;
		y=q;
	}
	void putxy()
	{
		System.out.println("x="+x+" y="+y);
	}
}
public class MultilevelInheritanceExample2 {

	public static void main(String[] args) {
		C1 obj=new C1();
		obj.getxy(10, 20);
		obj.putxy();

	}

}
