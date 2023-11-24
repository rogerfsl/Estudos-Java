package AbstractClass;

public class PessoaJuridica extends Pessoa{
	
	private int numFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double impostoRenda() {
		double pagImposto = 0;
		if(numFuncionarios > 10) {
			pagImposto = getRendaAnual() * 0.14;
		}else {
			pagImposto = getRendaAnual() * 0.16;
		}
		
		return pagImposto;
	}
	
	
	

}
