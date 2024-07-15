package assignment17;
import java.util.*;

public class AreaOfCircle 
{
   public static void main(String arg[])
   {
	   Scanner sobj = new Scanner(System.in);
       System.out.println("Enter radius :");
       int Radius = sobj.nextInt();
       float PI = 3.14f;
       
       float fResult = PI * Radius * Radius;
       
       System.out.println("Area of circle is :"+fResult);
       
   }
}
