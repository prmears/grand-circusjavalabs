package lab8BatStats;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;


public class Batter
{
	private String playerName;
	private int totalAtBats;
	private ArrayList<Integer> atBatList;

	public Batter()
	{
		totalAtBats = 0;
		atBatList = new ArrayList <Integer>();
	}

	public String getPlayerName() 
	{
		return playerName;
	}

	public void setPlayerName(String playerName) 
	{
		this.playerName = playerName;
	}

	public Batter(String playerName) 
	{
		this.playerName = playerName;
	}
	
	public String getSluggingAverage()
	{
		int BatterHitBaseTotal = 0;
		
		for(int i=0; i < atBatList.size(); i++)
		{
			int value = atBatList.get(i);
			BatterHitBaseTotal += value;
		}
		
		double battingAve = BatterHitBaseTotal / (double)totalAtBats;
		
		DecimalFormat decForm = new DecimalFormat("#.000");
		String formattedNumber = decForm.format(battingAve);
		return formattedNumber;
	}
	
	public String getBattingAverage()
	{
		int BatterHits = 0;
		for(int i=0; i < atBatList.size(); i++)
		{
			if(atBatList.get(i) > 0)
			{
				BatterHits++;
			}
		}
		
		double battingAve = BatterHits / totalAtBats;
		
		DecimalFormat decForm = new DecimalFormat("#.000");
		String formattedNumber = decForm.format(battingAve);
		return formattedNumber;
	}

	public void setAtBats(int atBatResult) 
	{
		atBatList.add(atBatResult);
		totalAtBats++;
	}
	
	//Comparator for sorting the list by BatterName
    public static Comparator<Batter> BatterNameComparator = new Comparator<Batter>() 
    {
    	public int compare(Batter s1, Batter s2)
    	{
    		String BatterName1 = s1.getPlayerName().toUpperCase();
    		String BatterName2 = s2.getPlayerName().toUpperCase();
    		
    		//ascending order
    		return BatterName1.compareTo(BatterName2);

    		//descending order
    		//return StudentName2.compareTo(StudentName1);
    
    	}
    };
   
	
}
