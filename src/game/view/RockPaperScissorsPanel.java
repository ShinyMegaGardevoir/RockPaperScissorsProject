package game.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import game.controller.RockPaperScissorsAppController;

import java.awt.Font;
import java.awt.Color;

import game.model.RockPaperScissors;

public class RockPaperScissorsPanel extends JPanel
{
	private RockPaperScissorsAppController baseController;
	private SpringLayout baseLayout;
	private JLabel firstLabel;
	private String resultsString;
	private JLabel resultsLabel;
	private JButton rockButton;
	private JButton paperButton;
	private JButton scissorsButton;
	
	public RockPaperScissorsPanel(RockPaperScissorsAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rockButton = new JButton("Rock");
		paperButton = new JButton("Paper");
		scissorsButton = new JButton("Scissors");
		firstLabel = new JLabel("Rock, Paper, or Scissors?");
		resultsString = new String("");
		resultsLabel = new JLabel(resultsString);
		
		
		
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(rockButton);
		this.add(paperButton);
		this.add(scissorsButton);
		this.add(firstLabel);
		this.add(resultsLabel);
		this.setSize(500,400);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, scissorsButton, 35, SpringLayout.SOUTH, firstLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstLabel, -35, SpringLayout.NORTH, rockButton);
		baseLayout.putConstraint(SpringLayout.NORTH, rockButton, 166, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, rockButton, -320, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, paperButton, 0, SpringLayout.NORTH, rockButton);
		baseLayout.putConstraint(SpringLayout.WEST, paperButton, 26, SpringLayout.EAST, rockButton);
		baseLayout.putConstraint(SpringLayout.WEST, scissorsButton, 294, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstLabel, 0, SpringLayout.WEST, resultsLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, resultsLabel, 46, SpringLayout.SOUTH, rockButton);
		baseLayout.putConstraint(SpringLayout.WEST, resultsLabel, 152, SpringLayout.WEST, this);
		resultsLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		firstLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));

		
	}
	
	private void setupListeners()
	{
		rockButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				RockPaperScissors.buttonResults = 1;
				RockPaperScissors.buttonResults = 3;
				if(RockPaperScissors.tieChecker = false)
				{
					if((RockPaperScissors.buttonResults == 1 && RockPaperScissors.computerResults == 2)
						|| (RockPaperScissors.buttonResults == 2 && RockPaperScissors.computerResults == 3)
						|| (RockPaperScissors.buttonResults == 3 && RockPaperScissors.computerResults == 1))
					{
						resultsString = "You Lose.";
						resultsLabel.setForeground(Color.RED);
						
					}
					else
					{
						resultsString = "You Win!";
						resultsLabel.setForeground(Color.GREEN);
					}
				}
				else
				{
					resultsString = "Tie";
				}

			}
		});
		
		paperButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				RockPaperScissors.buttonResults = 2;
				RockPaperScissors.buttonResults = 3;
				if(RockPaperScissors.tieChecker = false)
				{
					if((RockPaperScissors.buttonResults == 1 && RockPaperScissors.computerResults == 2)
						|| (RockPaperScissors.buttonResults == 2 && RockPaperScissors.computerResults ==3)
						|| (RockPaperScissors.buttonResults == 3 && RockPaperScissors.computerResults == 1))
					{
						resultsString = "You Lose.";
						resultsLabel.setForeground(Color.RED);
						
					}
					else
					{
						resultsString = "You Win!";
						resultsLabel.setForeground(Color.GREEN);
					}
				}
				else
				{
					resultsString = "Tie";
				}

				
			}
		});
		
		scissorsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				RockPaperScissors.buttonResults = 3;
				if(RockPaperScissors.tieChecker = false)
				{
					if((RockPaperScissors.buttonResults == 1 && RockPaperScissors.computerResults == 2)
						|| (RockPaperScissors.buttonResults == 2 && RockPaperScissors.computerResults ==3)
						|| (RockPaperScissors.buttonResults == 3 && RockPaperScissors.computerResults == 1))
					{
						resultsString = "You Lose.";
						resultsLabel.setForeground(Color.RED);
						
					}
					else
					{
						resultsString = "You Win!";
						resultsLabel.setForeground(Color.GREEN);
					}
				}
				else
				{
					resultsString = "Tie";
				}
			}
		});
		
	}

}
