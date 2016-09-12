package labs;
import java.util.Scanner;
public class lab2_1
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome! What is your name? (please enter your name):");
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name + ", would you like to play a game? (enter 'y' or 'n')");
		String choice = scanner.nextLine();
		
		if (choice.equalsIgnoreCase("n"))
		{
			System.out.println("You're no fun!");
			scanner.close();
			return;
		}
		
		while (!choice.equalsIgnoreCase("y"))
		{
			System.out.println("Not sure what you want");
			choice = scanner.nextLine();
		}
		
		System.out.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon! What would you do? (enter 'face the beast' or 'run away'");
		choice = scanner.nextLine();		
		if (choice.equalsIgnoreCase("face the beast" ))
		{
			System.out.println("You approach the dragon. you see that he has _ heads! 'enter 1,2 or 3' ");
			int choice1 = scanner.nextInt();
						
			System.out.println("No one has ever faced a " + choice1 + " headed dragon before! Choose your weapon! enter 'slingshot','sword' or 'bow and arrow'");
			
			choice = scanner.nextLine();
			choice = scanner.nextLine();
			
			System.out.println("We just printed the word: " + choice);
			
			String ch = choice.trim();
			if (ch.equalsIgnoreCase("bow and arrow"))
			{
				System.out.println("Armed with a bow and arrow, you appoarch the dragon. It strares at you with its _ eyes! choose red or blue");
			}
			else if (ch.equalsIgnoreCase("sword"))
			{
				System.out.println("Armed with sword, you appoarch the dragon. It stares at you with its _ eyes! choose red or blue");
			}
			else if (ch.equalsIgnoreCase("slingshot"))
			{
				System.out.println("Armed with your slingshot, you appoarch the dragon. It stares at you with its _ eyes! choose red or blue");
			}
											
			choice = scanner.nextLine();
			
			if (choice.equalsIgnoreCase("red"))
				System.out.println("Oh thank goodness! Red-eyed dragons are friendly. You name the dragon _.(enter a name)");
			else if (choice.equalsIgnoreCase("blue"))
				System.out.println("Oh thank goodness! Blue-eyed dragons are friendly. You name the dragon _.(enter a name)");
			
			String dragon = scanner.nextLine();
			System.out.println(name + " and " + dragon + " live happily ever after");

		}
		
		scanner.close();
	}
}
							
