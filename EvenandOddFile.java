import java.io.*;
import java.util.Scanner;
public class EvenandOddFile {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f1;
		int n,i;
		Scanner sc=new Scanner(System.in);
		try
		{
			f1= new FileOutputStream("numbers.txt");
			System.out.println("Enter the number of inputs");
			n=sc.nextInt();
			int a[]=new int[n+1];
			System.out.println("Enter the numbers");
			for (i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for (i=0;i<n;i++)
			{
				f1.write(a[i]);
			}
			f1.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File doesn't exist!");
			return;
		}
		try 
		{
			FileInputStream fi = new FileInputStream("numbers.txt");
			FileOutputStream odd = new FileOutputStream("Odd.txt");
			FileOutputStream even = new FileOutputStream("Even.txt");
			while((i=fi.read())!=-1)
			{
				if(i%2==0)
				{
					even.write(i);
				}
				else 
				{
					odd.write(i);
				}
			}
			fi.close();
			odd.close();
			even.close();
		}

		catch (Exception e)
		{
			System.out.println("File doesn't exist");
		}
		try 
		{
			System.out.println("Odd text file:\n");
			FileInputStream odd = new FileInputStream("Odd.txt");
			while((i=odd.read())!=-1)
			{
				System.out.println(i);
			}
			odd.close();
		}
		catch (Exception e)
		{
			System.out.println("File doesn't exist");
		}
		try 
		{
			System.out.println("Even text file:\n");
			FileInputStream even = new FileInputStream("Even.txt");
			while((i=even.read())!=-1)
			{
				System.out.println(i);
			}
			even.close();
		}
		catch (Exception e)
		{
			System.out.println("File doesn't exist");
		}
	}
}
	


