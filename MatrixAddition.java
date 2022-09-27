/*file:MatrixAddition.java
 * description:This program is used to Add two matrix
 * @author:Ayush
 * Created on 27 sept 2022
 *
 */
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int matrix1[][],matrix2[][],sum[][],row1,column1;
		System.out.println("Enter the size of Matrixes:");
		row1=in.nextInt();
		column1=in.nextInt();
		matrix1=new int[row1][column1];	
		matrix2=new int[row1][column1];
		sum=new int[row1][column1];
		System.out.println("Enter the Elements of the  Matrix1 :");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				matrix1[i][j]=in.nextInt();
			}
		}
		System.out.println("Enter the elements of Matrix2");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				matrix2[i][j]=in.nextInt();
			}
		}	
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				sum[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("The Sum of two Maxtrices are :");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}System.out.println();
		}
		

	}

}
