package br.com.generation.exercicios03;

import java.util.Scanner;

public class Exercicio01 {
	
	
	//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
    //atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] ponto = new int[5];
		int maiorPonto = 0;
		
		for(int i = 0; i < ponto.length; i++) {
			System.out.println("Digite o ponto: ");
			ponto[i] = entrada.nextInt();
			
			if(ponto[i] > maiorPonto) {
				maiorPonto = ponto[i];
			}
		}
			for(int i = 0; i < ponto.length; i++) {
				System.out.println(ponto[i] + " | ");
			}
			System.out.println("A maior pontuação é: " + maiorPonto);
			
			entrada.close();
	}

}
