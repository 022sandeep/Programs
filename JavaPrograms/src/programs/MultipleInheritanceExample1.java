package programs;
class StudentData
{
	int sub1,sub2;
}
interface StudentSports
{
	static final int spMarks=5;
	void display();
	
}

class StudentRecord extends StudentData implements StudentSports 
{
	int total;
	
	void getData(int s1,int s2)
	{
		sub1=s1;
		sub2=s2;
	}
	
	public void display()
	{
		total=sub1+sub2+spMarks;
		System.out.println("Total is:"+total);
	}
}
public class MultipleInheritanceExample1 {

	public static void main(String[] args) {
		StudentRecord obj=new StudentRecord();
		obj.getData(78, 89);
		obj.display();
	}

}
