package lab12;
//parent class
public class Player {

	private String playerName;  
	
	
	
	public Player(String playerName) 
	{
		super();
		this.playerName = playerName;
	}

	public void setPlayerName(String playerName) //assignment statement
	{
		this.playerName = playerName;
	}
	
	public String getPlayerName()
	{
		return playerName;
	}

	

	public Roshambo generateRoshambo() // ex.method
	{
		return null;
	}

	
	
}
