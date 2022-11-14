package programs;

public class StringExamples {

	public static void main(String[] args) 
	{

      String str1="Madhya Pradesh";
      int count=0;
      
      int length=str1.length();
      
      for(int i=0;i<=length-1;i++)
      {
    	  char ch=str1.charAt(i);
    	  if(ch=='h')
        	  {
        		  System.out.println(" char is:"+str1.charAt(i));
        		  count++;
        	  } 
      }
      
      
     System.out.println("Number of occurence of char:"+count);
    
	}

}
