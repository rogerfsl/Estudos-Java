package Vetores;

import java.util.Scanner;

public class Pensao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		
		Estudante[] estudante = new Estudante[10];
		
		
		System.out.print("Quantos estudantes vão alugar quartos: ");
		int qtdEstudantes = scan.nextInt();
		
		String nome;
		String email;
		
		for(int i =0; i <qtdEstudantes; i++) {
			scan.nextLine();
			
			System.out.print("Digite o nome do " + (i+1) + " estudante: ");
			nome = scan.nextLine();
			System.out.print("Digite o email do " + (i+1) + " estudante: ");
			email = scan.nextLine();
			System.out.print("Digite o número do quarto desejado: ");
			int numQuarto = scan.nextInt();

			estudante[numQuarto - 1] = new Estudante(nome, email);
		}
		
		for(int i = 0; i < estudante.length; i++) {
			if(estudante[i] != null) {
				System.out.println("Quarto número: " + (i+1)+ " " + estudante[i]);
			}
		}
		
	}

}
