package gui.view;

import javax.swing.*;
import gui.controller.GuiController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiPanel extends JPanel
{
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	private GuiController baseController;
	
	public GuiPanel(GuiController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Do not click the button");
		firstTextField = new JTextField("you can type words here");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Loads content into our panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 75, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 137, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -41, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -25, SpringLayout.EAST, this);
	}
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("You clicked it.");
			}
		});
		
	}

	
	
	
}
