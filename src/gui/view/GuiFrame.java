package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;
/**
 * Creates the frame for the gui project
 * @author nhay7834
 *@version0.2 Nov 9, 2015 added setup frame helper method
 */
public class GuiFrame extends JFrame
{
	private GuiController baseController;
	private GuiPanel basePanel;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController; //Assigns parameter to the data member. 
		basePanel = new GuiPanel(baseController);
		setupFrame();
		
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(500, 500); //Sets our size
		this.setVisible(true);
	}
}
