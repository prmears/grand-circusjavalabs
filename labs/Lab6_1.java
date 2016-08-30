package labs;

import java.util.Scanner;

public class Lab6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		boolean engWord = true;

		while (engWord) {
			
			System.out.println("Enter a word: ");
			
			String word = scanner.nextLine().toLowerCase().toUpperCase();
			
			
			char firstLetter = word.charAt(0);
			
            
			if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o'
					|| firstLetter == 'u') {

				word = word + "way";

				System.out.println(word);
				
			} else 
			{ 
				for (int i = 0; i < word.length(); i++) {
					
					if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
							|| word.charAt(i) == 'u') 
					{
						String first;
                      	first = word.substring(0, i);
						word = word + first + "ay";						
						word = word.substring(i);
						System.out.println(word);
						break;
					}
				}
			}
			
			System.out.println("Translate again? (y/n)");
			String input = scanner.nextLine();
			
			if(input.equalsIgnoreCase("n")){
				
				System.out.println("Good Bye");
				
				engWord = false;
				
			}
			
			
		}

	}



	}


