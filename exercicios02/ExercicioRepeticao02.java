package br.com.generation.exercicios02;

import java.util.Scanner;

//		2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.

public class ExercicioRepeticao02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, par = 0, impar = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número");
			num = entrada.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}if(num % 2 == 1) {
				impar++;
			}
			
		}System.out.println("Foram digitados " + par + " números pares\n");
		System.out.println("E " + impar + " números ímpares");
	}

}
