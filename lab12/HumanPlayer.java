package lab12;

import java.util.Random;

public class HumanPlayer extends Player
	{
	public HumanPlayer(String playerName) 
	{
		super(playerName);
	}
	
	@Override
	public Roshambo generateRoshambo() {
		System.out.println("Rock,Paper,or Sissor?");
	
		Random rn = new Random();
		int answer = rn.nextInt(3) + 1;
	switch(answer)
	
	{
	case 1:
		return Roshambo.ROCK;
	case 2:
		return Roshambo.SCISSORS;
	case 3:
		return Roshambo.PAPER;
	default:

	return null;
	}
}
}
