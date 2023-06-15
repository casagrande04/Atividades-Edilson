package br.com.objetos;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) 
	{
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		// fase de inicialização
		int total = 0; // inicializa a soma das notas
		int gradeCounter = 0; // inicializa o n° de notas inseridas ate agora
		
		// fase de processamento
		// solicita entrada e le a nota do usuario
		System.out.println("Enter grade or -1 to quit: ");
		int grade = input.nextInt();
		
		// faz um loop ate ler o valor de sentinela inserido pelo usuario
		while (grade != -1)
		{
			total = total + grade; //adiciona grade total
			gradeCounter = gradeCounter + 1;
			
			// solicita entrada e le a proxima nota fornecida pelo usuario
			System.out.printf("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		}
		
		// fase de termino
		// se usuario inseriu pelo menos uma nota...
		if (gradeCounter != 0)
		{
			// usa  numero com ponto decimal para calcular media das notas
			double average = (double) total / gradeCounter;
			
			//exibe o total e a media (com dois digitos de precisao)
			System.out.printf("%nTotal of the %d grades entered is %d%n",
					gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
		}
		else // nenhuma nota foi inserida, assim gera a saida da mensagem apropriada
			System.out.println("No grades were entered");
	}
} // fim da classe ClassAverage
