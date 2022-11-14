package programs;

abstract class AbstractExample
{
	void concretMethod()
	{
		System.out.println("This is Concret method");
	}
	
	abstract void abstractMethod();	
}
 class NonAbstractClass extends AbstractExample
 {
	 void abstractMethod()
	 {
		 System.out.println("Abstract method is defined in NonAbstractClass");
	 }
 }

public class AbstractClassImplementation {

	public static void main(String[] args) 
	{
		NonAbstractClass obj=new NonAbstractClass();
        obj.concretMethod();
        obj.abstractMethod();
	}

}
