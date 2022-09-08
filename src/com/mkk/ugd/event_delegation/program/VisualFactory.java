package com.mkk.ugd.event_delegation.program;

import javax.swing.*;

public final class VisualFactory 
{
	
	private static VisualFactory INSTANCE;
	
	private JFrame mainFrame;	
	
	private VisualFactory() 
	{
		mainFrame = new JFrame("Uygulama Ekrani");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		goster();
	}

	public static VisualFactory getINSTANCE() 
	{
		if(INSTANCE == null)
		{
			INSTANCE = new VisualFactory();
		}
		
		return INSTANCE;
	}
	
	public void goster()
	{
		mainFrame.setVisible(true);
	}


	public JFrame getMainFrame() {
		return mainFrame;
	}

}
