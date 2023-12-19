package workingWithFiles;

public class Products {
	
	private String name;
	private double unitPrice;
	private int qtd;
	
	
	
	public Products(String name, double unitPrice, int qtd) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.qtd = qtd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double totalPrice () {
		return unitPrice * qtd;
	}
	

}
