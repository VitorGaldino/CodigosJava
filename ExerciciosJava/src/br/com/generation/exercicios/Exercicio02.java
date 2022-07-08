package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {

//	2- Faça um programa que entre com três números e coloque em ordem crescente.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;
		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = entrada.nextInt();
		entrada.close();
		
		System.out.println("\n");
		
		if((num1 < num2 && num1 < num3) || (num1 == num2 && num2 == num3)) {
			System.out.println("O menor número foi: " + num1);
		}else if(num2 < num3 || num2 == num3) {
			System.out.println("O menor número foi: " + num2);
		}else {
			System.out.println("O menor número foi: " + num3);
		}

	}

}
