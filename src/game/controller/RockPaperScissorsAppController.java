package game.controller;

import game.view.RockPaperScissorsFrame;

public class RockPaperScissorsAppController
{
	private RockPaperScissorsFrame appFrame;
	private RockPaperScissorsAppController dataController;
	public RockPaperScissorsAppController()
	{
		RockPaperScissorsAppController dataController = new RockPaperScissorsAppController();
		appFrame = new RockPaperScissorsFrame(this);
		
	}
	
	public RockPaperScissorsFrame getAppFrame()
	{
		return appFrame;
	}
	
	public RockPaperScissorsAppController getDataController()
	{
		return dataController;
	}
	
	
	public void start()
	{
		
	}
}
