package programs;

public class ArrayIndexExample {

	public static void main(String[] args) 
	{
       int a[]= {12,34,40};
       try
       {
       a[4]=a[1]/a[2];
       System.out.println("Value after addition is:"+a[4]);
       }
       catch(Exception e)
       {
    	  System.out.println("Error is:"+e); 
       }
      
       a[0]=a[2]-a[1];
       System.out.println("Value after Subtraction is:"+a[0]);
	}

}
