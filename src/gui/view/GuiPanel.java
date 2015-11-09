package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiController;

import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

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
	private void setupLayout(){
		
	}
	private void setupListeners()
	{
		
	}

	
	
	
}
