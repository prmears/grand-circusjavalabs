package labs;

import java.util.Scanner;

public class Lab7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int studentIndex;
		String choice = "y";
		
		String[] name {"Harry", "Harmonie", "Ron", "Ginniy", "Neville", "George","Fred", "Luna", "Seamus" ,"Draco", "Crabbe"
				+ "Goyle", "Sirius","Remus", "Dumbledore","Mcgonagall","Hagrid","Voldemort","Rowena","Helena"};
		String[] homeTown {"Detroit","Flint","Taylor","Ypsilanti","Ann Arbor","Diagon Ally","Hogwarts";"hogsmead","Slyterin","Ravenclaw","Chicago","Narnia","Camolot","Eden"
				+ "Eden", "Valhalla", "Avalon", "Shagrila", "Atlantis","Eldorado"};
		String[] favFood {"Pizza","Taco","HotDogs","Chili","Chicken", "Corn","Ribs", "M&C","Pasta","Okra", "ham","Bread", "cornbread","beans","cassarole","watermelon",
				+  "grapes","icecream","cake","pie"};
		
		for(int i = 0; i< name.length; i++){
			//write code to print out list of names
			System.out.println( (i+1) + " " +name[i] );
		}// end of for-loop print out list of names
		System.out.println("welcome to grand circus. Who would you like to learn more about?" + "(enter a number 1-5)");
		
		studentIndex=sc.nextInt();
		try{
			 
		}
				System.out.println(name[0]);
			}catch(

	IndexOutOfBoundsException ex)
	{
		String message = "invalid index number.";
		System.out.println(message);
	}

}

///// need to integrate this code into lab

while (choice.equals("y")) {
	listNames(name);
	System.out.println("Which student would you like to learn more about?");
	try {
		studentIndex = scanner.nextInt() - 1;
		System.out.println("Student " + (studentIndex + 1) + " is " + name[studentIndex]);

	} catch (IndexOutOfBoundsException | IllegalArgumentException ex) {
		System.out.println("You have entered an invalid number.  Please choose from 1-20.");
		continue;
	} catch (InputMismatchException ex) {
		System.out.println("You have entered an invalid response.  Please choose a number from 1-20.");
		scanner.next();
		continue;
	}
	scanner.nextLine();
	while (true) {
		System.out.println("What would you like to learn about this person? (Hometown or favorite food)");
		answer = scanner.nextLine();
		if (answer.equalsIgnoreCase("hometown")) {
			System.out.println(name[studentIndex] + " is from " + hometown[studentIndex]);
			break;
		} else if (answer.equalsIgnoreCase("favorite food")) {
			System.out.println(name[studentIndex] + "'s favorite food is " + favoriteFood[studentIndex]);
			break;
		} else {
			System.out.println("Please choose from the two options that were presented.");
		}

	}
	while (true) {
		System.out.println("Do you want to choose another person? (y/n)");
		choice = scanner.next();
		if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")) {
			break;
		} else {
			System.out.println("Invalid entry.  Enter a y or n");
			continue;
		}
	}
}
scanner.close();
System.out.println("Goodbye.");
}

public static void listNames(String[] name) {
for (int i = 0; i < name.length; i++) {
	System.out.println(i + 1 + " " + name[i]);
}

return;
}

}