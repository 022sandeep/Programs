package programs;
class Base2
{
	int x,y;
	void getXY(int p,int q)
	{
		x=p;
		y=q;
	}
	 void putXY()
	 {
		System.out.println("x="+x+" y="+y) ;
	 }
	
}

class Child extends Base2
{
	int p,q;
	void getPQ(int a,int b)
	{
		p=a;
		q=b;
	}
	void putPQ()
	 {
		System.out.println("p="+p+" q="+q) ; 
	 }	
	
}

public class SingleInheritanceExample2 {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.getXY(10, 20);
		obj.getPQ(20, 30);
		obj.putXY();
		obj.putPQ();


	}

}
