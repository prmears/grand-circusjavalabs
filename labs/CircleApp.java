package labs;
import java.lang.Math;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class CircleApp
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		String continuePrompt = "y";
		double radius=0;
		
		int count = 0;
		
		do 
		{	
			try
			{	
				System.out.println("Enter radius");
				radius = sc.nextDouble();
				
				Circle crcl =  new Circle(radius);
				System.out.println("Ok, your area is " + crcl.getFormattedArea());
				System.out.println("Ok, your circumference is " + crcl.getFormattedCircumference()); 
				
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Invalid data");
				sc.next();
				continue;
			}
			
		
			System.out.println("");
			System.out.println("Do you wanna go again? y/n");
			continuePrompt = sc.next();
			
			count = Circle.getObjectCount();
			
		}while (continuePrompt.equalsIgnoreCase("y"));
	
		System.out.println("\nGoodbye.(object count: " + count + ")");
		sc.close();
	}
	
	public static class Circle 
	{	
		private double radius;
		private double circumference;
		private double area;
		private final double  PI = 3.14;
		private static int objectCount = 0;
		
		public Circle(double radius)// constructor
		{
			this.radius = radius;
			++objectCount;
		}
		
		public double getCircumference()
		{
			circumference =  (2 * PI * radius);
			
			 return circumference;
			
		}
		
		public String getFormattedCircumference()
		{
			getCircumference();
			return formatNumber(circumference);
		}
		
		public double getArea()
		{
			area =  (PI * radius * radius );
			 return area;
			
		}
		public String getFormattedArea()
		{
			getArea();
			return formatNumber(area);
		}
		private String formatNumber(double x)
		{
			String result = String.format("%.2f", x);
			return result;
		}
		
		public static  int getObjectCount()
		{	
			return objectCount;
		}
	
	}
}