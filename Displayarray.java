/*file:Displayarray 
 * description:This program is used to display array 
 * @author:Ayush
 * Created on 27 sept 2022
 *
 */ 
 

import java.util.Scanner;
public class Displayarray 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int arr[],size;
		System.out.println("Enter the size of  an array:");
		size=in.nextInt();
		arr=new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("The numbers are:");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}

	}

}
