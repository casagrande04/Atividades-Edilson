package br.com.objetos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.com.classes.Shapes;

public class ShapesTest 
{

	public static void main(String[] args) 
	{
		//obtem a escolha do usuario
		String input = JOptionPane.showInputDialog(
				"Enter 1 to draw rectangles\n" +
		"Enter 2 to draw ovals");
		
		int choice = Integer.parseInt(input); // converte a entrada em int
		
		// cria o painel com a entrada do usuario
		Shapes panel = new Shapes(choice);
		
		JFrame application = new JFrame(); // cria um novo JFrame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);

	}

} // fim da classe ShapesTest
