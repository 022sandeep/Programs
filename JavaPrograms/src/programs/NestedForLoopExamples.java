package programs;

public class NestedForLoopExamples {

	public static void main(String[] args) 
	{

		 int row,col;
		 
		 for(row=3;row>=1;row--)
		 {
			 for(col=3;col<=row;col--)
			 {
				 System.out.print(" "+col);
			 }
			 System.out.println();
		 }


	}

}