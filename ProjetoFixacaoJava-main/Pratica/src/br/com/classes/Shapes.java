package br.com.classes;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Shapes extends JPanel {

	private int choice; // escolha do usuario de qual fomra desenhar
	
	// construtor configura a escolha do usuario
	public Shapes(int userChoice)
	{
		choice = userChoice;
	}
	
	//desenha uma cascata de formas que iniciam do canto superior esquerdo
	public void painComponent (Graphics g)
	{
		super.paintComponent(g);
		
		for (int i = 0; i < 10; i++)
		{
			// seleciona a forma com base na escolha do usuario
			switch (choice)
			{
			case 1: // desenha retangulos
				g.drawRect(10 + i * 10, 10 + i * 10,
						50 + i * 10, 50 + i *10);
				break;
			case 2: //desenha ovais
				g.drawOval(10 + i * 10, 10 + i*10,
						50 + i * 10, 50 +i * 10);
				break;
			}
		}
	}

} // fim da clase Shapes
