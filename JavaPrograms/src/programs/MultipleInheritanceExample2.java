package programs;
class Department
{
	String deptName;
	int rollNo;
}
interface Library
{
	void displayInfo();
}
class StudentDepartmentInfo extends Department implements Library
{
	void getInfo(String dept,int roll)
	{
		deptName=dept;
		rollNo=roll;
	}
	public void displayInfo()
	{
		System.out.println("Department="+deptName+" roll no="+rollNo);
	}
}
public class MultipleInheritanceExample2 {

	public static void main(String[] args) {
		StudentDepartmentInfo obj=new StudentDepartmentInfo();
		obj.getInfo("Computer Engineering", 1);
		obj.displayInfo();
	}

}
