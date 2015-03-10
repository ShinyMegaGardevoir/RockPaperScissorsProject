package game.view;

import game.controller.RockPaperScissorsAppController;

import javax.swing.*;

public class RockPaperScissorsFrame extends JFrame
{
	
	private RockPaperScissorsPanel appPanel;
	
	public RockPaperScissorsFrame(RockPaperScissorsAppController baseController)
	{
		appPanel = new RockPaperScissorsPanel(baseController);
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setSize(500,400);
		this.setResizable(false);
		this.setContentPane(appPanel);
		this.setVisible(true);
	}
	

}
