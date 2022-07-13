package br.com.generation.exercicios04;

public class TestaCliente {

//		1- Cria uma classe cliente e apresente os atributos e métodos referentes
//		esta classe, em seguida crie um objeto cliente, defina as instância deste
//		objeto e apresente as informações deste objeto no console.
	
	
		public static void main(String[] args) {
	//Objeto cliente
			
			Cliente cliente1 = new Cliente();
			
			cliente1.setNome("Vitor Galdino");
			cliente1.setTelefone("11997452015);");
			cliente1.setEndereço("Rua da esquerda, 712");
			
			System.out.println("Dados do Cliente: ");
			System.out.println("Nome: " + cliente1.getNome());
			System.out.println("Telefone " + cliente1.getTelefone());
			System.out.println("Endereço: " + cliente1.getEndereço());
					
	}

}
