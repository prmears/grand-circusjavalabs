package lab12;

import java.util.Random;

public class RandomPlayer extends Player 
	{
	public RandomPlayer(String playerName) {
		super(playerName);
	}
	
	@Override
	public Roshambo generateRoshambo() {
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
