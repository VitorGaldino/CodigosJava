package br.com.generation.exercicios04;

public class TestaAviao {

	/* Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console. */


	public static void main(String[] args) {
		Aviao av1 = new Aviao();
		
		av1.setModelo("Boeing 737");
		av1.setCompanhia("Varig");
		av1.setIdade(10);
		
		System.out.println("Dados do avisão: ");
		System.out.println("Modelo: " + av1.getModelo());
		System.out.println("Companhia aérea: " + av1.getCompanhia());
		System.out.println("Idade do avião: " + av1.getIdade() + " anos");
	}

}
