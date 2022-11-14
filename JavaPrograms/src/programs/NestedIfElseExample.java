package programs;

public class NestedIfElseExample 
{

	public static void main(String[] args) 
	{
		int no1=230,no2=34,no3=700;
		
		if(no1>no2)
		{
			 if(no1>no3)
			 {
				 System.out.println("Greatest number is no1:"+no1); 
			 }
			 else
			 {
				 System.out.println("Greatest number is no3:"+no3); 
			 }
			
		}
		else
		{
			if(no2>no3)
			{
				System.out.println("Greatest number is no2:"+no2); 
			}
			else
			{
				System.out.println("Greatest number is no3:"+no3);
			}
			
		}
		

	}

}
