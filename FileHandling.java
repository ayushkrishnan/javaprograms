import java.util.Scanner;
import java.io.*;
public class FileHandling {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name to continue");
		String name=sc.nextLine(); 
		try 
		{
			File f=new File(name);
			if(f.exists()==false) 
			{
				if(f.createNewFile())
				{
					System.out.println("File created successfully");
					System.out.println("Enter the text to continue");
					String text=sc.nextLine();
					FileOutputStream out=new FileOutputStream(f);
					out.write(text.getBytes());
					out.flush();
					out.close();
					System.out.println("Text saved sucessfully");
					System.out.println("The file contents are\n");
					FileInputStream in=new FileInputStream(f);
					int character;
					while ((character = in.read()) != -1) 
					{
						System.out.print((char)character);	
					}
					in.close();
					System.out.println("\nEnter the file name to copy the contents");
					String Name=sc.nextLine();
					File f1=new File(Name);
					if(f1.exists()) 
					{
	                	System.out.println("file already exists");
	                }
	                else 
	                {
	                	f1.createNewFile();
	                }
	               String copycontents;
	               FileReader fr=new FileReader(f);
	               BufferedReader br=new BufferedReader(fr);	              
	               copycontents=br.readLine();
	               FileWriter fr1=new FileWriter(f1);
	               fr1.write(copycontents);
	               fr1.close();
	               if(f1.exists()==true) 
	               {
						System.out.println("\tThe copied contents are:\n");
						FileInputStream inn=new FileInputStream(f);
						int charact;
						while ((charact=inn.read())!=-1) 
						{
							System.out.print((char)charact);	
						}
						in.close();
	                 }
	           }
           }
	    }
		catch(IOException e) 
		{
			e.printStackTrace();
		}
  }
}

