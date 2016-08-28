package labs;
import java.util.Random;
import java.util.Scanner;

public class DiceGame 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("welcome to the Grand Circus casino");
		System.out.println("");

		System.out.println("how many sides does your dice have?");
		
		int numberOfRolls = 0;
		int numberOfDiceSides = 0;
		do
		{
			numberOfDiceSides = scanner.nextInt();
			if(numberOfDiceSides < 2)
				System.out.println("Can't be less than 2 sides. Try again...");
		}
		while(numberOfDiceSides < 2);
		// it was best to put in a do loop here because I wondered what would happen in the user was 
		// enter a number less then 2 in the answer. So if the user chooses a number greater then 2 
		//the program asks to roll. if answer is less then 2 then the program tell is to try again.
		
		
		System.out.println("Would you like to roll the dice? (enter 'y' or 'n')");
		scanner.nextLine();
		String choice = scanner.nextLine();
		while(choice.equalsIgnoreCase("Y"))
		{
			numberOfRolls++;
			System.out.println("Roll " + numberOfRolls);
			// by adding numberOfRolls++ in the game it shows the number of times the 
			// has thrown the dice.
			
			int x = rollADie(numberOfDiceSides);
			int y = rollADie(numberOfDiceSides);
			System.out.println(x);
			System.out.println(y);
			// at first I forgot to put 2 variables, but I realized my mistake and 
			// made x and y.
			
			System.out.println("Roll Again? (enter 'y' or 'n')");
			choice = scanner.nextLine();
		}

		//Done and exiting now
		System.out.println("Good bye, thank you playing!!");
		scanner.close();
		
	}

	//numberOfSides is the maximum and the 1 is our minimum 
	public static int rollADie(int numberOfSides)
	{
		Random rand = new Random();
		int  n = rand.nextInt(numberOfSides) + 1;
		
		return n;
	}	// I found the random integer method of slackoverflow.com
		// I tried 2 other methods but this seem to be the easiest and best.
	
}
