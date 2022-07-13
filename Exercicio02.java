package br.com.generation.exercicios03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	    //que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	    //imprima a média aritmética dos lançamentos, contabilize e apresente também
	    //quantas foram as ocorrências da maior pontuação.
		
		Scanner entrada = new Scanner(System.in);
		
		int[] dadosVetor = new int[10];
		int qtdNum = 0, maiorNum = 0;
		double media = 0.0, soma = 0;
		
		for(int i = 0; i < dadosVetor.length; i++) {
			System.out.println("Digite a posição que seu dado caiu (1 a 6): ");
			dadosVetor[i] = entrada.nextInt();
			
			if(dadosVetor[i] > maiorNum) {
				qtdNum = 1;
				maiorNum = dadosVetor[i];
			}
			else if(dadosVetor[i] == maiorNum) {
				qtdNum++;
			}
		}
			for(int i = 0; i < dadosVetor.length; i++) {
				soma += dadosVetor[1];
				media = soma/dadosVetor.length;
			}
			
			System.out.println("Média: " + media);
			System.out.println("Maior número: " + maiorNum);
			System.out.println("A quantidade de vezes que o dado caiu o maior número foi: " + qtdNum);
			entrada.close();
	}

}
