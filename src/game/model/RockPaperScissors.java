package game.model;

public class RockPaperScissors
{
	public static int buttonResults;
	public static int computerResults;
	private String gameResults;
	public static boolean tieChecker;

	
	public RockPaperScissors()
	{
	
		buttonResults = -1;
		computerResults = -1;
		gameResults = "";
		tieChecker = false;
	}
	
	public int getButtonResults()
	{
		return buttonResults;
	}
	
	public int getComputerResults()
	{
		return computerResults;
	}
	
	public String getGameResults()
	{
		return gameResults;
	}
	
	public boolean getTieChecker()
	{
		if(buttonResults == computerResults)
		{
			tieChecker = true;
		}
		else
		{
			tieChecker = false;
		}
		
		return tieChecker;
	}
	
	
}
