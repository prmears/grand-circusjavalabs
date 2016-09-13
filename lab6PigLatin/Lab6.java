package lab6PigLatin;

import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println("");

		
		String englishWord = scanner.nextLine();
		String latinWord = scanner.nextLine();

		
		String originalSentance;
		do {
			System.out.println("Enter words to be translated");
			originalSentance = scan.nextLine();
			if (originalSentance.length() == 0) {
				System.out.println("try again");
				break;
			}
	public static String translateWord(String englishWord); 
		{
			String latinWord = englishWord.toLowerCase();
			// TODO Write this code
			
		
		char firstChar =latinWord.charAt(0);
		if(firstChar =='a'|| firstChar == 'e'|| firstChar == 'i'||firstChar == 'o'|| firstChar == 'u'){
		latinWord=latinWord.concat("way");	
		}
		else{
			System.out.println("you have entered a consonant");
			for(int i=0)(i<latinWord.length();i++){
				char x =latinWord.charAt(i);
				if (x== 'a' || x=='e'||x=='i'||x=='o'||x=='u'){
			}
		}
		
		return latinWord;
		
		}
}
