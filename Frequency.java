/*file:Frequency count
 *description:   it is used to count the Frequency of the given character
 * @author:Ayush
 * Created on:06 October 2022
 */

import java.util.Scanner;

public class Frequency 
{
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
	        int l,count=0,i;
	        char ch;
	        String str;
	        System.out.println("Enter the string:");
	        str=sc.nextLine();
	        System.out.println("Enter the letter:");
	        ch=sc.next().charAt(0);
	        l=str.length();
	        for(i=0;i<l;i++) 
	        {
	        	if(str.charAt(i)==ch)
	        		{
	        			count++;
	        		}
	        }
	        System.out.println("The frequency of given character= "+count);
	}

}