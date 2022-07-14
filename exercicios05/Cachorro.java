package br.com.generation.exercicios05;

public class Cachorro extends Animal implements Animal01 {

	private String nome;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public void somAnimal() {
		System.out.println("au.. au.. au");
	
	}
	@Override
	public void correrSubir() {
		System.out.println("Cachorro correndo...");
	}
}
