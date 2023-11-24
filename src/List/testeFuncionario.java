package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class testeFuncionario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Digite a quantidade de funcionários que serão cadastrados: ");
		int qtdFuncionario = scan.nextInt();
		
		List<Funcionario> listaFuncionario = new ArrayList<>();
		
		for(int i = 0; i < qtdFuncionario; i++) {
			
			System.out.print("Digite o ID do " + (i+1) + "º funcionário: ");
			Integer id = scan.nextInt();
			while(hasId(listaFuncionario, id)) {
				System.out.print("Id Inválido! Digite novamente: ");
				id = scan.nextInt();
			}
			scan.nextLine();
			System.out.print("Digite o nome do " + (i+1) + "º funcionário: ");
			String nome = scan.nextLine();
			System.out.print("Digite o salário do " + (i+1) + "º funcionário: ");
			double salario = scan.nextDouble();
			
			listaFuncionario.add(new Funcionario(id, nome, salario));
			

		
		}
		
		System.out.print("Digite o ID do funcionário que receberá aumento: ");
		int buscaID = scan.nextInt();
		
		Integer pos = posicao(listaFuncionario, buscaID);
		if(pos == null) {
			System.out.println("Id digitado não existe.");
		}else {
			System.out.println("Digite a porcentagem de aumento: ");
			int porcentagem = scan.nextInt();
			listaFuncionario.get(pos).aumentoSalario(porcentagem);
		}
		
	
		for (Funcionario funcionario : listaFuncionario) {
			System.out.println(funcionario);
		}
	
	}
	
	public static boolean hasId(List<Funcionario> lista, int id) {
		Funcionario emp = lista.stream().filter(x -> x.getId()== id).findFirst().orElse(null);
		return emp != null;
	}
	
	public static Integer posicao (List<Funcionario> lista, int id) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}

/* for(int i = 0; i < listaFuncionario.size(); i++) {
			if(listaFuncionario.get(i).getId() == buscaID) {
				System.out.print("Digite a porcentagem do aumento: ");
				int porcentagem = scan.nextInt();
				listaFuncionario.get(i).aumentoSalario(porcentagem);
			}else {
				System.out.println("Funcionário não cadastrado.");
			}
		}*/
