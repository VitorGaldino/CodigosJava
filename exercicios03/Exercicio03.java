package br.com.generation.exercicios03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

//		Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
//		das matrizes N1 e N2;
//		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
//		posição das matrizes N1 e N2.
	
		Scanner entrada = new Scanner(System.in);
		
		int [][]  vetorN1 = {{56,70,54,27,8,48},{46,21,22,23,24,25},{30,31,32,33,34,35},{40,41,42,43,44,45}};
		int [][]  vetorN2 = {{30,31,32,33,34,35},{40,41,42,43,44,45},{50,51,52,53,54,55},{60,61,62,63,64,65}};
		int [][] vetorM1 = new int[4][6];
		int [][] vetorM2 = new int[4][6];
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c <= 5; c++) {
				vetorM1[l][c] = vetorN1[l][c] + vetorN2[l][c];
				vetorM2[l][c] = vetorN1[l][c] - vetorN2[l][c];
			}
		}
			System.out.println("Soma: " + "\n");
			for(int l = 0; l < 4; l++) {
				for(int c = 0; c <= 5; c++) {
					System.out.println(vetorM1[l][c] + " | ");
				}
				System.out.println();
			}
			
			System.out.println("\n Subtração: " + "\n");
			for(int l = 0; l <= 3; l++) {
				for(int c = 0; c <= 5; c++) {
					
					System.out.print(vetorM2[l][c] + " | ");
				}
				
				System.out.println();
			}
	
	}

	
	
	
	}
