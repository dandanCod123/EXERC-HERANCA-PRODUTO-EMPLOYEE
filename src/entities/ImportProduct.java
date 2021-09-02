package entities;

public class ImportProduct extends Product {

	private Double customsFee;

	

	public ImportProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return customsFee + price;
	}
	public String priceTga() {
		return getName() + "$" + String.format("&.2f",price) + "(customsFee:  $" + String.format("&.2f",customsFee);
	}
}
