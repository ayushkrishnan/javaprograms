/*
 * 
 */
class OverloadDemo
{
   void area(float x,float y)
   {
	   
	   System.out.println("the area of the triangle is "+.5*x*y+" squnits");
   }
   void area1(float a,float b)
   {
	   System.out.println("the area of the rectangle is "+a*b+" sq units");
   }
   void area(double x)
   {
	   double z = 3.14 * x * x;
	   System.out.println("the area of the circle is "+z+" sq units");
   }
}

public class MethordOverloading 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		OverloadDemo ob = new OverloadDemo();
		ob.area(20,45);
		ob.area1(11,12);
		ob.area(5.5);
		
	}

}
