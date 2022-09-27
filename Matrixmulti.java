/*file:MatrixMultiplication.java
 * description:This program is used to multiply two matrix
 * @author:Ayush
 * Created on 27 sept 2022
 *
 */
import java.util.Scanner;

public class Matrixmulti 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
				Scanner in= new Scanner(System.in);
				int matrix1[][],matrix2[][],mat3[][],row1,column1,row2,column2;
				System.out.println("Enter the size of Matrix1");
				row1=in.nextInt();
				column1=in.nextInt();
						
				System.out.println("Enter the size of Matrix2");
				row2=in.nextInt();
				column2=in.nextInt();
				if(column1==row2)
				{
					matrix1=new int[row1][column1];				
					matrix2=new int[row2][column2];
					mat3=new int[row1][column2];
					System.out.println("Enter the Elements of the  Matrix1 ");
					for(int i=0;i<row1;i++)
					{
						for(int j=0;j<column1;j++)
						{
							matrix1[i][j]=in.nextInt();
						}
					}
				
					System.out.println("Enter the elements of Matrix2");
					for(int i=0;i<row2;i++)
					{
						for(int j=0;j<column2;j++)
						{
							matrix2[i][j]=in.nextInt();
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
					System.out.println("The elements of Second Matrix is ");
					for(int i=0;i<row2;i++)
					{
						for(int j=0;j<column2;j++)
						{
							System.out.print(matrix2[i][j]+"\t");
						}System.out.println();
					}
					System.out.println("Multiplication of two Matrix is");
					for(int i=0;i<row1;i++)
					{
						for(int j=0;j<column2;j++) 
						{
							for(int k=0;k<column1;k++)
							{
								mat3[i][j]+=matrix1[i][k]*matrix2[k][j];
							}
							System.out.print(mat3[i][j]+"\t");
						}
						System.out.println();
					}
				}
				else
				{
					System.out.println("Matrix multiplication is not possible!");
				}

			}

	}


