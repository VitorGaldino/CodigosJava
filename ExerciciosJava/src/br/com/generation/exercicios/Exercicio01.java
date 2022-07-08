package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {

// 	1- Faça um programa que receba três inteiros e diga qual deles é o maior.
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;
		int maior = 0;
		
		System.out.println("Primeiro número é: ");
		num1 = entrada.nextInt();
		maior = num1 >= maior ? num1 : maior;
		
		System.out.println("Segundo número é: ");
		num2 = entrada.nextInt();
		maior = num2 >= maior ? num2 : maior;
		
		System.out.println("Terceiro número é: ");
		num3 = entrada.nextInt();
		maior = num3 >= maior ? num3 : maior;
		
		System.out.println("Maior número é: " + maior);
}

}
