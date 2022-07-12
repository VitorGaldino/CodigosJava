package br.com.generation.exercicios02;

import java.util.Scanner;

public class ExercicioRepeticao05 
{

	public static void main(String[] args) 
	{
		
// 5 Crie um programa que leia um número do teclado até que encontre um
//		número igual a zero. No final, mostre a soma dos números
//		digitados.
		

		Scanner entrada = new Scanner(System.in);
		
		int soma = 0, num = 0, i = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = entrada.nextInt();
			
			if(num != 0) {
				soma += num;
			}
			if(num == 0) 
			{
			
			System.out.println("Número igual a zero: \nFim de programa...");
			break;
				
			}
			
			i++;
		}while(i <= 3);
		
		System.out.println("A soma dos números é: " + soma);
		
		entrada.close();
		
	
	}
}
