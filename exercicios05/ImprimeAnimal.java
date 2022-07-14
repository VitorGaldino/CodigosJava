package br.com.generation.exercicios05;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TestaAnimal teste = new TestaAnimal();
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		
		System.out.println("Som do animal: ");
		teste.somAnimal(new Cachorro());
		teste.somAnimal(new Cavalo());
		teste.somAnimal(new Preguica());
		System.out.println();
		
		System.out.println("Correr ou subir a arvore: ");
		dog.correrSubir();
		sloth.correrSubir();
		horse.correrSubir();
		System.out.println();
		
		System.out.println("--- CACHORRO ---");
		dog.setNome("Spike");
		dog.setIdade(4);
		System.out.println("O cachorro se chama " + dog.getNome() + " ele tem " + dog.getIdade() + " anos!");
		
		System.out.println("--- CAVALO ---");
		horse.setNome("Pé de pano");
		horse.setIdade(12);
		System.out.println("O cavalo se chama " + horse.getNome() + " ele tem " + horse.getIdade() + " anos!");
		
		System.out.println("--- PREGUIÇA ");
		sloth.setNome("Cansada");
		sloth.setIdade(20);
		System.out.println("A preguiça se chama " + sloth.getNome() + " ela tem " + sloth.getIdade() + " anos!");
	}

}
