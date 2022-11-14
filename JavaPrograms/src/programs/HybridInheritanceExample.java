package programs;
class StudentInformation
{
	String name;
}

class StudentAdmission extends StudentInformation
{
	String collegeName,courseName;
}

interface SportMarks
{
	int spMarks=5;	
}

class StudentRecord1 extends StudentAdmission implements SportMarks
{	
	void getData(String nm,String cNm,String crNm)
	{
		name=nm;
		collegeName=cNm;
		courseName=crNm;
	}
	void display()
	{
		System.out.println("Name of Student is:"+name);
		System.out.println("College name of Student is:"+collegeName);
		System.out.println("Course name of Student is:"+courseName);
		System.out.println("Sports marks of Student is:"+spMarks);		
	}	
}

public class HybridInheritanceExample {

	public static void main(String[] args) {
		StudentRecord1 obj=new StudentRecord1();
		obj.getData("Rajesh","MIT","IT");
		obj.display();		
	}

}
