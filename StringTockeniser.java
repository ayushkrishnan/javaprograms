import java.util.StringTokenizer;
import java.util.Scanner;
public class StringTockeniser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 Scanner sc=new Scanner(System.in);
			 String s;
			 System.out.println("Enter the string: ");
			 s=sc.nextLine();
			 StringTokenizer str=new StringTokenizer(s," ");
			int sum=0;
			while(str.hasMoreTokens())
			{
				int a=Integer.parseInt(str.nextToken());
				System.out.println(a);
				sum=sum+a;
			}
			 System.out.println("Sum="+sum);
		 }
}
	

