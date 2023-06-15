package br.com.objetos;

public class Increment {

	public static void main(String[] args) 
	{
		// demonstra o operador de pós-incremento
		int c = 5;
		System.out.printf("c before postincrement: %d%n", c); // imprime 5
		System.out.printf("   postincrement c: %d%n", c++); // imprime 5
		System.out.printf("c after postincrement: %d%n", c); // imprime 6
		
		System.out.println(); // pula uma linha
		
		//demonstra o operador de pré-incremento
		c = 5;
		System.out.printf("c before pretincrement: %d%n", c); // imprime 5
		System.out.printf("   preincrement c: %d%n", c++); // imprime 5
		System.out.printf("c after preincrement: %d%n", c); // imprime 6
	}

}// fim da classe Increment
