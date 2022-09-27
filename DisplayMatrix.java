/*file:DisplayMatrix.java
 * descripion:Display of a matrix using array
 *@Author:Ayush
 *created on 27 sept 2022
 * 
 */

import  java.util.Scanner;
public class DisplayMatrix
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int matrix1[][],row1,column1;
		System.out.println("Enter the size of row:");
		row1=in.nextInt();
		System.out.println("Enter the size of coloumn:");
		column1=in.nextInt();
		matrix1=new int[row1][column1];
		System.out.println("Enter the Elements of the  matrix :");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				matrix1[i][j]=in.nextInt();
			}
		}
		System.out.println("The elments of the maxtrix is:");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				System.out.print(matrix1[i][j]+"\t");
			}System.out.println();
		}
		
		

	}

}
