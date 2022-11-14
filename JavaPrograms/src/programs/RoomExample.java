package programs;

class Room
{
	double length,width;
	void getData(double l,double w)
	{
		length=l;
		width=w;
	}
		void putData()
	{
			
			double area=length*width;
		System.out.println("Length of room is:"+length+"\nWidth of room is:"+width+"\nArea is:"+area);
	}
}
public class RoomExample
{
	public static void main(String[] args)
	{
		Room obj=new Room();
		obj.getData(5.5,2.5);
		obj.putData();
		
	}

}
