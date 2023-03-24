package kr.or.kosa;

public class Beverage {
	private int productNo;
	private int stock = 10;
	private int price;
	private String name;

	public Beverage(int productNo, int stock, int price, String name) {
		this.setProductNo(productNo);
		this.setPrice(price);
		this.setName(name);
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}