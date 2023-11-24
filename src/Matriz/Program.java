package Matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = scan.nextInt();
		
		int[][] matriz = new int[num][num];
		int contNegativo = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite um número inteiro para a coluna " + i + " e para a linha " + j + ": ");
				matriz[i][j] = scan.nextInt();
				if(matriz[i][j] < 0) {
					contNegativo++;
				}

			}
		}
		 for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                if (i == j) { // verifica se está na diagonal principal
	                    System.out.print(matriz[i][j] + " ");
	                } else {
	                    System.out.print("x ");
	                }
	            }
	            System.out.println();
	        }
		
		
		System.out.println("Foram digitados " + contNegativo + " números negativos na matriz.");

	}
	
	/*System.out.println("\nNúmeros da diagonal principal:");
    for (int i = 0; i < matriz.length; i++) {
        System.out.println(matriz[i][i]);
    }*/

}
