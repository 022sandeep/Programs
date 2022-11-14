package programs;


class StudentDetails
{
	int rollNo;
	String name;
	
	
//	void getInfo(int r,String n)
//	{
//		rollNo=r;
//		name=n;
//	}
	void putInfo()
	{
		System.out.println("Roll no:"+rollNo+"  Name:"+name);		
	}	
}
public class StudentInfoDetailsExample 
{
	public static void main(String[] args) 
	{
		StudentDetails obj1=new StudentDetails();
//		obj1.getInfo(1, "Ram");
		obj1.putInfo();
				
		StudentDetails obj2=new StudentDetails();
//		obj2.getInfo(2, "Shyam");
		obj2.putInfo();
		
		StudentDetails obj3=new StudentDetails();
//		obj3.getInfo(3, "Soham");
		obj3.putInfo();
		

	}

}
