package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
// 	3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
//		categoria ela se encontra:		
	
		Scanner leia = new Scanner(System.in);
		System.out.println("Coloque a sua idade: ");
		int idade = leia.nextInt();
	
		leia.close();
		
		if(idade >=10 && idade <=14) {
			System.out.println("Você se encontra na faixa etária infantil");
		}if (idade >=15 && idade <=17){
			System.out.println("Você se encontra na faixa etária juvenil");
		}if (idade >=18 && idade <=25) {
			System.out.println("Você se encontra na faixa etária adulta");
		} 
		
		

	}

}
