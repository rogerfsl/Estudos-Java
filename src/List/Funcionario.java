package List;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private double salario;
	
	

	public Funcionario() {
		
	}


	public Funcionario(Integer id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}


	public double aumentoSalario(int porcentagem) {
		double aumento = (this.salario * porcentagem) / 100;
		
		return this.salario += aumento;
	}

	@Override
	public String toString() {
		return "Id: " + id + "\nNome: " + nome + "\nSalario: R$ " + String.format("%.2f", salario) + "\n";
	}
	
	

}
