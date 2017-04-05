/*****************************************************************
Main method for the Pet A Dog

@author Molly Alger
@version 6 April 2017
*****************************************************************/

import javax.swing.JFrame;

public class Game {

	public static void main (String[] args)
	{	
		JFrame frame = new JFrame ("Pet A Dog!");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setVisible(true);
		PetADog game = new PetADog();
		frame.getContentPane().add(game);
	}
	
}
