package gui.controller;

import gui.view.GuiFrame;

/**
 *  controller for the simple gui project
 * @author nhay7834
 *
 */
public class GuiController
{
	
	/**
	 * Reffereance to our GUIFrame object of the view.
	 */
	private GuiFrame baseFrame;
	
	public GuiController()
	{
		baseFrame = new GuiFrame(this);
	}
	
	
	public void start()
	{}
		
}
