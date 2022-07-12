package br.com.generation.exercicios02;

import java.util.Scanner;

public class ExerciciosRepeticao06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, soma = 0, cont = 0;
		double mediaMulti = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = entrada.nextInt();
			
			if((num % 3 ==0) && (num != 0)) {
				cont += 1;
				soma = num + soma;
			}
		}while(num != 0);
		
		mediaMulti = (double)soma/(double)cont;
		System.out.println("A média do multiplos por 3 é: " + mediaMulti);
	}

}
