package lab8BatStats;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BatterApp 
{
	public static void main(String[] args)
	{	
		ArrayList<Batter> batterList = new ArrayList <Batter>();
		Scanner sc = new Scanner(System.in);
		String AnotherBatter = "n";
		
		System.out.println("Welcome to the Batting Average Calculator:");
		
		do
		{
			System.out.println("Enter player's name:");
	
			String theBattersName = sc.next();
			Batter theBatter = new Batter();
			theBatter.setPlayerName(theBattersName);
	
			String KeepGoing = "n";
			
			batterList.add(theBatter);
			
			System.out.println("0=out, 1=single,2=double,3=triple,4=Home Run");
			
			do
			{
				System.out.println("Result for at-bat: ");
				int batResult = sc.nextInt();
				
				try
				{
					ValidateUserInput(batResult);
				}
				catch(Exception ex)
				{
					continue;
				}
				
				theBatter.setAtBats(batResult);
				
				System.out.println("Another at-bat?(y/n): ");
				KeepGoing = sc.next();
			}
			while (KeepGoing.equalsIgnoreCase("y"));
	
			System.out.println("Another Batter?(y/n):");
			AnotherBatter = sc.next();
		}
		while (AnotherBatter.equalsIgnoreCase("y"));
		
		Collections.sort(batterList, Batter.BatterNameComparator);
		
		
		for(int i=0; i < batterList.size(); i++)
		{
			System.out.println("Player's name: " + batterList.get(i).getPlayerName());
			System.out.println("Batting Average: " + batterList.get(i).getBattingAverage());
			System.out.println("Slugging Percentage " + batterList.get(i).getSluggingAverage());
			System.out.println("");
		}
		
		sc.close();
	}

	private static void ValidateUserInput(int batResult)
	{
		
		
	}
}
	
	
	
	
	
	

	
	