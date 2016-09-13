package labs;

import java.util.Scanner;

public class codepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		//1)		
		byte tinynumber = 19;
	
		//2)
		short smallnumber = 100-24;
		
		//3)
		int tenniscourtArea = 78*27;
		
		//4)
		long distanceInfeet = 92960000*5280;
			
		//5)
		float circumferance = (float)(3.1415 * 2 *18);
		
		//6)
		double spOfLightToEarth = 149600000000.0 / 299792458.0 / 60.0; 
		
		//7)
		char letter = 'M';
		
		//8)
		char greaterLet = (char) (M + 5);
		
		//9
		
				
		//10)
		System.out.println("what is your name?");
		String name = scanner next();
		
		//11)
		System.out.println("pick an number between 1-10");
		int choice = scanner nextInt();	
		
		scanner.close();
	}
}


//section code practice#3

	//1
	for(int i = 0; i > 3; i++){
		System.out.println("Hello world");
	}
	
	//2
	for (int i = 0; i < 10; i++) {
		System.out.println(i);
	}
	
	//3
	for (int i = 1; i <= 10; i++) {
		System.out.println(i);
	}
	//4
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
	//5
		string yesOrno = "yes";
		
		while (yesOrno.equalsIgnoreCase("yes")){
			System.out.println("do something.");
			
			System.out.println("do you want to keep going?");
			yesOrno = scanner.nextLine();
		}
			
		//6
		yesOrNo = "yes";
		while (!yesOrNo.equalsIgnoreCase("no")) {
			System.out.println("Do Something");

			System.out.println("Do you want to keep going?");
			yesOrNo = scanner.next();
		}
		System.out.println("Goodbye Question 6.");
			
			
			
			
	//7
		char letter = 'H';
			do {
				letter++;
				System.out.println(letter);
				
		} while (letter != 'Z');
			
	
	// string practice #5
	// 1
			String first = "David";
			String last = "Wolverton";
			
			String fullName= first + " " + last;
			
			
	//2
		System.out.println("what is your user name?");
		String name = scanner next();
		if ( name.equals.("David")){
			System.out.println("youre the instructor!");
		}
	//3
		if (name.equalsIgnoreCase.("David)) {
			System.out.println("You're the instructor!");
			}
			
	//4
			System.out.println("name.charAt(0)");
			
	//5
			if (name contains char("f"));
			String name = scanner next();
			System.out.println (name.contains Char("f"));
			
	//6
			if (name.startsWith("Dav"));
			System.out.println("starts with Dav");
			
	//7
			string tongueTwist = "she sells Sea shells by the seashore.";
			System.out.println(tongueTwist.replace ('s','S'));
			
	//8
			System.out.println(tongueTwist.replaceAll("ell", "oo"));
			
	//9
			System.out.println(tongueTwist.lenght());
			
	//10
			System.out.println(tongueTwist.indexOf ("y"));
			
	//11
			String tongueTwist = "She sells seashells by the seashore.";
			System.out.println(tongueTwist.allinLowercase);
			
	//12
			StringBuffer fullNameBuffer = new StringBuffer();
			fullNameBuffer.append("first");
			fullNameBuffer.append(" ");
			fullNameBuffer.append("last");
			
	//13
			String name ="NASA";
			for int (i=0;i < name.length;i++);
			System.out.println (name.charAt(i));
			
	//14
			String phrase = "Grant Chirpus loves Detroit";
			System.out.println(phrase.substring(, )); 
			System.out.println(phrase.substring(, )); 
			System.out.println(phrase.substring(14, 19)); 
			System.out.println(phrase.substring(20)); // 
		
			
	//section 6 practice exceptions
			
	//1
			System.out.println("Enter a number");
			String userInput = scanner.next();
			try 
			{
				int number = Integer.parseInt(userInput);
				System.out.println("You entered a number. The square is" + (number * number));
			} 
			catch (NumberFormatException ex) {
				System.out.println("You did not enter a number.");
			}
			
			
	//2
			System.out.println("Enter a number");
			try 
			{
				int number = scanner.nextInt();
				System.out.println("You entered a number. The square is" + (number * number));
			} 
			catch (InputMismatchException ex) {
				System.out.println("You did not enter a number.");
			}
			
	//3
			System.out.println("Enter a number");
			int number =scanner.nextInt();
			
			int validnumber= scanner.nextInt();
			
			
			
			
			
		//code practice #7 arrays
			
			//1
			
			String[] tenStrings = new String[10];
			System.out.println(tenStrings[2]);
			
			//2
			
			int[] fiveInts = new int[5];
			System.out.println(fiveInts[0]);
			
			//3
			
			System.out.println("choose number between 0-50");
			int newArray = scanner.nextInt();
			float[] someFloats = new float[newArray]
			
			//4
			int[] fibonacci = new int[] { 1, 1, 2, 3, 5, 8, 13 };
			
			//5
			System.out.println(fibonacci.length);
			
			//6
			fibonacci[0] = 0;
			
			//7
			fibonacci[6] + 8;
			
			//8
			char[] myLetters = { 'a', 'b', 'c' };
			char[] yourLetters = myLetters;
			System.out.println(yourLetters.char.upperCase[0]);
			
			//9
			yourLetters = new char[] { 'x', 'y', 'z' };

			//10
			
			//11
			
			
			//12
			
			fibonacci = new int[] { 1, 1, 2, 3, 5, 8, 13 };
			for (int i = 0; i < fibonacci.length; i++) {
				System.out.println(fibonacci[i]);

			//13
				int sum = 0;
				for (int i = 0; i < fibonacci.length; i++) {
					sum += fibonacci[i];
				}
				System.out.println(sum);

			//14
				for (int number : fibonacci) 
				{
					System.out.println(number);
				}
	}
	}
