import java.util.Random;
import java.util.Scanner;
//package labs;

public class Lab5 
{
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("welcome to the Grand Circus casino");
		System.out.println("");

		System.out.println("how many sides does your dice have?");
		int numberOfDiceSides = scanner.nextInt();
		int numberOfRolls = 0;
		 
		System.out.println("Would you like to roll the dice? (enter 'y' or 'n')");
		String choice = scanner.nextLine();
		while(choice.equalsIgnoreCase("Y"))
		{
			numberOfRolls++;
			System.out.println("Roll " + numberOfRolls);
			
			int x = rollADie(numberOfDiceSides);
			int y = rollADie(numberOfDiceSides);
			System.out.println(x);
			System.out.println(y);
			
			
			System.out.println("Roll Again? (enter 'y' or 'n')");
			choice = scanner.nextLine();
		}
	}
	
	//numberOfSides is the maximum and the 1 is our minimum 
	public static int rollADie(int numberOfSides)
	{
		Random rand = new Random();

		int  n = rand.nextInt(numberOfSides) + 1;
	}	
}
