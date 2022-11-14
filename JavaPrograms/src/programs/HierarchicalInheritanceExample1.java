package programs;
class College
{
	String collegeName,branchName;
	
}
class Branch1 extends College
{
	void getBranch1(String name,String br)
	{
		collegeName=name;
		branchName=br;
	}
	void putBranch1()
	{
		System.out.println("College name="+collegeName+" Branch name="+branchName);
	}
}

class Branch2 extends College
{
	void getBranch2(String name,String br)
	{
		collegeName=name;
		branchName=br;
	}
	void putBranch2()
	{
		System.out.println("College name="+collegeName+" Branch name="+branchName);
	}
}
class Branch3 extends College
{
	void getBranch3(String name,String br)
	{
		collegeName=name;
		branchName=br;
	}
	void putBranch3()
	{
		System.out.println("College name="+collegeName+" Branch name="+branchName);
	}
}
public class HierarchicalInheritanceExample1 {

	public static void main(String[] args) 
	{
		Branch1 br1=new Branch1();
		br1.getBranch1("VIT","CO");
		br1.putBranch1();
		
		Branch2 br2=new Branch2();
		br2.getBranch2("MIT","IT");
		br2.putBranch2();
		
		Branch3 br3=new Branch3();
		br3.getBranch3("RIT","EE");
		br3.putBranch3();
	}

}
