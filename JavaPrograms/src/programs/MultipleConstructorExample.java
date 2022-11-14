package programs;
class Student
{
	int rollNo;
	String name;
	Student()    //Default COnstructor
	{
		rollNo=1;
		name="Ram";
		System.out.println("Roll no="+rollNo+"  Name="+name);
	}
	Student(int r,String n)
	{
		rollNo=r;
		name=n;
		System.out.println("Roll no="+rollNo+"  Name="+name);
	}
	Student(double r,String n)
	{
		rollNo=(int)r;
		name=n;
		System.out.println("Roll no="+rollNo+"  Name="+name);
	}	
	
	
	
}
public class MultipleConstructorExample {

	public static void main(String[] args) {
		Student obj1=new Student(); //Default constructor will be called
			
		Student obj2=new Student(2,"Shyam");
		
		
		Student obj3=new Student(3.0,"Raj");
		
		
	}

}
