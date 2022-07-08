package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {
/*  4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	ímpar exiba o número elevado ao quadrado.*/
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int resultado;
		System.out.println("Insira o número: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		resultado = numero % 2;
		if (resultado == 0) {
			System.out.println("O número informado é par, sua raiz quadrada é: " + Math.sqrt(numero) );
			
		}else {
			int quadrado = numero * numero;
			System.out.println("O número informado é ímpar e elevado ao quadrado é: " + quadrado);
		}
		
}
}

