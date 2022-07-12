package br.com.generation.exercicios02;

import java.util.Scanner;

public class ExercicioRepeticao04 {

	public static void main(String[] args) {
		
// Uma empresa desenvolveu uma pesquisa para saber as características
/*		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre:
*/
		int i = 0, idade = 0, sexo;
		int mulher = 0, homem = 0, outros = 0;
		int calmo = 0, agressivo = 0, nervoso = 0, temperamento = 0;
		int maisNervoso = 0, menosCalmo = 0, totalCalmo;
		
		Scanner entrada = new Scanner(System.in);
		
		while(i <= 3) {
			System.out.println("Informe a sua idade: ");
			idade = entrada.nextInt();
			
			System.out.println("Digite 1 para informar o sexo feminino" + "\nDigite 2 para sexo masculino: " + "\nDigite 3 para Outros: ");
			sexo = entrada.nextInt();
			
			System.out.println("Digite 1 se você se considera uma pessoa calma: " + "\nDigite 2 se considera uma pessoa nervosa: " + "\nDigite 3 se considera um pessoa agressiva:");
			temperamento = entrada.nextInt();
			
			if (temperamento == 2) 
			{
				nervoso++;
				if(sexo == 1) 
				{
					mulher++;
				}
			}
			if (temperamento == 3) 
			{
				agressivo++;
				if (sexo == 2) 
				{
					homem++;
				}
			}
			if(temperamento == 1)
			{
				calmo++;
				if(sexo == 3);
				{
					outros++;
				}
			} if(idade >= 40 && temperamento == 2)
			{		
				maisNervoso++;
			}	
		
			if(idade <= 18 && temperamento == 1) 
			{
				
			menosCalmo++;
		}
				i++;
		
				System.out.println("O número de pessoas calmas: " + calmo);
				System.out.println("O número de mulheres nervosas> " + mulher);
				System.out.println("O número homens agressivos: " + homem);
				System.out.println("O número de outros calmos: " + outros);
				System.out.println("O número de pessoas nervosas com mais de 40: " + maisNervoso);
				System.out.println("O número de pessoas calmas com menos 18 anos: " + menosCalmo);
	}
	
	} 

}
