package Vetores;

public class Estudante {
	private String nome;
	private String email;
	private double aluguel = 500;
	
	public Estudante(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAluguel() {
		return aluguel;
	}

	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}

	@Override
	public String toString() {
		return "Formulário: Nome: " + nome + ", Email:" + email + ", Valor aluguel: R$ " + aluguel;
	}
	
	
		
	

}
