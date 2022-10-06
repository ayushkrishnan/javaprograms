/*file:Stringpalindrome 
 * description:This program is used to check a word is palindrome or not 
 * @author:Ayush
 * Created on 06 October 2022
 *
 */ 

import java.util.Scanner;
 
public class Strpalindrome 
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String str, reverseStr="";
	   System.out.println("Enter the string:");
	   str= sc.nextLine();

	   int strLength = str.length();
	   for(int i=(strLength-1); i>=0; --i)
	   {
	    reverseStr=reverseStr +str.charAt(i);
	   }
	   if(str.toLowerCase().equals(reverseStr.toLowerCase()))
	   {
	    System.out.println(str + " is a palindrome");
	   }
	   else
	   {
	    System.out.println(str + " is not a palindrome");
	   }
	}

}