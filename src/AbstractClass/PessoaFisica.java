package AbstractClass;

public class PessoaFisica extends Pessoa{
	
	private double gastosSaude;

	
	
	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double impostoRenda() {
		double pagImposto = 0;
		if (getRendaAnual() < 2000) {
			pagImposto = getRendaAnual() * 0.15;
		} else {
			pagImposto = getRendaAnual() * 0.25;

		}
		if (gastosSaude > 0) {
			pagImposto -= gastosSaude * 0.5;
		}
		
		return pagImposto;
	}
	
	

}
