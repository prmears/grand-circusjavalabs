package MovieLab10;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Movie List Application!\n");
		String continuePrompt = "y";
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("Blade Runner", "scifi"));
		movieList.add(new Movie("Alien", "scifi"));
		movieList.add(new Movie("Star Wars", "scifi"));
		movieList.add(new Movie("Nosferatu", "horror"));
		movieList.add(new Movie("King Kong", "horror"));
		movieList.add(new Movie("Frankenstein", "horror"));
		movieList.add(new Movie("Toy Story 3", "animated"));
		movieList.add(new Movie("UP", "animated"));
		movieList.add(new Movie("Finding Nemo", "animated"));
		movieList.add(new Movie("Seven Samurai", "action"));
		movieList.add(new Movie("Skyfall", "action"));
		movieList.add(new Movie("Mad Max", "action"));
		movieList.add(new Movie("The Nutty Professor", "comedy"));
		movieList.add(new Movie("Beverly Hills Cop", "comedy"));
		movieList.add(new Movie("Dr. Doolittle", "comedy"));

		System.out.println("There are " + movieList.size() + " movies in this list.");

		do {

			System.out.println("What category are you interested in?");
			String userInput = scanner.nextLine();
			System.out.println();

			if (userInput.equalsIgnoreCase("scifi")) {
				for (int i = 0; i < movieList.size(); i++) {
					Movie movie = movieList.get(i);
					if (movie.getCategory().equalsIgnoreCase("scifi")) {
						System.out.println(movie.getTitle());
					}
				}
			} else if (userInput.equalsIgnoreCase("horror")) {
				for (int i = 0; i < movieList.size(); i++) {
					Movie movie = movieList.get(i);
					if (movie.getCategory().equalsIgnoreCase("horror")) {
						System.out.println(movie.getTitle());
					}
				}
			} else if (userInput.equalsIgnoreCase("animated")) {
				for (int i = 0; i < movieList.size(); i++) {
					Movie movie = movieList.get(i);
					if (movie.getCategory().equalsIgnoreCase("animated")) {
						System.out.println(movie.getTitle());
					}
				}
			} else if (userInput.equalsIgnoreCase("action")) {
				for (int i = 0; i < movieList.size(); i++) {
					Movie movie = movieList.get(i);
					if (movie.getCategory().equalsIgnoreCase("action")) {
						System.out.println(movie.getTitle());
					}
				}
			} else if (userInput.equalsIgnoreCase("comedy")) {
				for (int i = 0; i < movieList.size(); i++) {
					Movie movie = movieList.get(i);
					if (movie.getCategory().equalsIgnoreCase("comedy")) {
						System.out.println(movie.getTitle());
					}
				}
			} else {
				System.out.println(
						"You entered invalid input.\nYour choices are 'scifi' 'horror' 'animated' 'action' or 'comedy'");

			}
			System.out.println("\nContinue? y/n");
			continuePrompt = scanner.nextLine();
		} while (continuePrompt.equalsIgnoreCase("y"));
		System.out.println("\nGoodbye...");
		scanner.close();
	}
}