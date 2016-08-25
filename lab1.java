import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scanner = new Scanner(System.in);
	System.out.println("Welcome to Grand Circus' Room Detail Generator!");
	
	
			
			System.out.println("Enter Length");
			int length = Scanner.nextInt ();
			
	
			
			System.out.println("Enter Width");
	int width = Scanner.nextInt();
	
			
			System.out.println("Area");  
			int area = length * width;
		System.out.println(area);
			System.out.println("Perimeter");
			int perimeter = length + width + length + width;
			System.out.println(perimeter);
		
	}
	

}
