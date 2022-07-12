package br.com.generation.exercicios02;

import java.util.Scanner;

public class ExercicioRepeticao03 {

	public static void main(String[] args) {

		
			int i = 0;
			int idade;
			int idadeMenor = 0;
			int idadeMaior = 0;
			
			Scanner entrada = new Scanner(System.in);
			
			while (i <= 3) {
				System.out.println("Digite sua idade: ");
				idade = entrada.nextInt();
				
				if(idade >=0 && idade < 21) {
					idade = idadeMenor;
					idadeMenor = idadeMaior +1;
				}
				if(idade > 50) {
					idade = idadeMaior;
					idadeMenor = idadeMaior + 1;
				}
				else if (idade == -99) {
					System.out.println("Fim do programa...");
					break;
				}
				i++;
			}
			
				System.out.println("A quantidade de pessoas com menos de 21 anos é: " + idadeMenor);
				System.out.println("A quantidade de pessoas com mmais de 50 anos é: " + idadeMaior);
			
			
	}

}
