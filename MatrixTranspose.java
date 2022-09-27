/*
 * file:MatrixTranspose.java
 * description:This program is used to find transpose of matrix
 * @author:Ayush
 * Created on:27 sept 2022
 */

import java.util.Scanner;

public class MatrixTranspose
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int matrix1[][],matrix2[][],row1,column1;
		System.out.println("Enter the size of Matrix");
		row1=in.nextInt();
		column1=in.nextInt();		
		matrix1=new int[row1][column1];				
		matrix2=new int[column1][row1];
		System.out.println("Enter the Elements of the  Matrix1 ");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				matrix1[i][j]=in.nextInt();
			}
		}
		System.out.println("The elments of the First Maxtrix is");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				System.out.print(matrix1[i][j]+"\t");
			}System.out.println();
		}
		
		for(int i=0;i<column1;i++)
		{
			for(int j=0;j<row1;j++)
			{
				matrix2[i][j]=matrix1[j][i];
			}
		}		
			
			
			
			System.out.println("The elements of Transpose Matrix is ");
			for(int i=0;i<column1;i++)
			{
				for(int j=0;j<row1;j++)
				{
					System.out.print(matrix2[j][i]+"\t");
				}System.out.println();
			}
		

	}

}
