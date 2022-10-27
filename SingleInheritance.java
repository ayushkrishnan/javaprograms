/**
 * file
 * description:
 * @author Ayush
 *Created on:18 October 2022
 */


import java.util.Scanner;
	
class Room
{
		int length,width;
		Room(int l,int w)
	{
		length=l;
		width=w;
	}
	int area()
	{
		return(length*width);
	}
}
class Bedroom extends Room
{
		int height;
		Bedroom(int l,int w,int h)
		{
			super(l,w);
			height=h;
		}
		int volume()
		{
		return(length*height*width);

		}
}
class SingleInheritance
{
	public static void main(String args[])
	{
			Bedroom room1=new Bedroom(10,20,30);
			int area=room1.area();
			System.out.println("area of the room is:"+area);
			int vol=room1.volume();
			System.out.println("volume of the room is:"+vol);
	}
}

	

