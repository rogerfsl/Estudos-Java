package HerancaPolimorfismo;

public class ImportedProduct extends Product{
	
	private double customsFee;

	public ImportedProduct(String name, double price, double customsFree) {
		super(name, price);
		this.customsFee = customsFree;
	}

	public double getCustomsFree() {
		return customsFee;
	}

	public void setCustomsFree(double customsFree) {
		this.customsFee = customsFree;
	}
	public double totalPrice() {
		return getPrice() + customsFee;
		
	}
	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
	

}
