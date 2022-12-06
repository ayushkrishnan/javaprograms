/*
 * 
 */
import java.util.Scanner;
public class ArthimeticExp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a,b,c,arr[];
		System.out.println("1.Arithmetic Exception ");
		System.out.println("2.Array Index Out Of Bounds Exception");
		System.out.println("Enter your Choice: ");
		c=in.nextInt();
		switch(c){
		case 1:
		{
				System.out.println("Program To perform Division");
				System.out.println("Enter number-1:");
				a=in.nextInt();
				System.out.println("Enter number -2:");
				b=in.nextInt();
				try
				{
					int res;
					res=a/b;
					System.out.println("Result="+res);
				}
				catch(ArithmeticException e)
				{
					System.out.println(e+" is not possible");
				}
				finally{
			
					System.out.println("finally block content");
					System.out.println("My code is safe from exception");
					System.out.println("Do you want to continue y or n");
				
				}
			break;
		}
			case 2:
			{
				int p;
				
				System.out.println("Enter the no of elemets you want to store:");
				p=in.nextInt();
				arr= new int[p]; 
				System.out.println("Enter the elements of the array:");
				for(int i=0;i<=p;i++)
				{
					arr[i]=in.nextInt();
				}
				System.out.println("Array Length:"+p);
				System.out.println("Array elements are:");
				for(int i=0;i<=p;i++)
				{
					System.out.println(arr[i]);
				}
				try {
					int j;
					System.out.println("Enter the position of element to be accessed:");
					j=in.nextInt();
					for(int i=0;i<=p;i++)
					{
						System.out.println(arr[i]);
					}
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e);
				}
		}
		}
		
	}

}
