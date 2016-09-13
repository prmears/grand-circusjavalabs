package MovieLab10;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieApp_1 
{
	public static void main(String[] args) 
	{
		ArrayList<MovieClass> movieList = new ArrayList <MovieClass>();
		
		FillArray(movieList);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Movie List Application!");
		
		System.out.println("There are " + movieList.size() + " movies in this list.");
		
		String continuePrompt = "y";
		
		do 
		{	
			try 
			{					
				System.out.println("What category are you interested in?\n");
				
				String userInput = scanner.nextLine();
				
				for(int i=0; i < movieList.size(); i++)
				{
					if(userInput.equalsIgnoreCase(movieList.get(i).getCategory()))
					{
						System.out.println(movieList.get(i).getTitle());
					}
				}
			} 
			catch (InputMismatchException ex) 
			{
				System.out.println("Invalid input...");
			}
		
			System.out.println("");
			System.out.println("Do you wanna go again? y/n");
			continuePrompt = scanner.nextLine();
			
		}while (continuePrompt.equalsIgnoreCase("y"));

		System.out.println("\nGoodbye.");
		scanner.close();
	}

	private static void FillArray(ArrayList<MovieClass> movieList) 
	{	
		MovieClass mc = new MovieClass("Blade Runner", "scifi");
		movieList.add(mc);
		mc = new MovieClass("Alien", "scifi");
		movieList.add(mc);
		mc = new MovieClass("Star Wars", "scifi");
		movieList.add(mc);
		mc = new MovieClass("Nosferatu", "horror");
		movieList.add(mc);
		mc = new MovieClass("King Kong", "horror");
		movieList.add(mc);
		mc = new MovieClass("Frankenstein", "horror");
		movieList.add(mc);
		mc = new MovieClass("Toy Story3", "anima");
		movieList.add(mc);
		mc = new MovieClass("UP", "anima");
		movieList.add(mc);
		mc = new MovieClass("Finding Nemo", "anima");
		movieList.add(mc);
		mc = new MovieClass("Seven Samurai", "action");
		movieList.add(mc);
		mc = new MovieClass("Mad Max", "action");
		movieList.add(mc);
		mc = new MovieClass("SkyFall", "action");
		movieList.add(mc);		
		mc = new MovieClass("Nutty Professor", "comedy");
		movieList.add(mc);
		mc = new MovieClass("Beverley Hills Cop", "comedy");
		movieList.add(mc);
		mc = new MovieClass("Dr. Dolittle", "comedy");
		movieList.add(mc);
	
	}

	public static class MovieClass 
	{
		private String _title;
		private String _category;		

		public MovieClass (String Title, String Category ) 
		{
			this._title = Title;
			this._category = Category;
		}
		
		public String getTitle()
		{
			return _title;
		}
		
		public String getCategory()
		{
			return _category;
		}
	}
}
