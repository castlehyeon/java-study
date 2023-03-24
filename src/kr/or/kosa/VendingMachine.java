package kr.or.kosa;

public class VendingMachine {

	public VendingMachine(String manufacturer, String color, Beverage americano, Beverage latte, Beverage espresso) {
		this.manufacturer = manufacturer;
		this.color = color;
		this.americano = americano;
		this.latte = latte;
		this.espresso = espresso;
	}
	
	private String manufacturer;
	private String color;
	
	private Beverage americano;
	private Beverage latte;
	private Beverage espresso;
	
	public int checkStock(Beverage beverage){return beverage.getStock();}
	public int checkStock(){return americano.getStock() + latte.getStock() + espresso.getStock();}
	public void restoreBeverage(Beverage beverage) {beverage.setStock(10);}
	public void restoreBeverage() {
		americano.setStock(10);
		latte.setStock(10);
		espresso.setStock(10);
		}
	public boolean checkMoney(int money, Beverage beverage) {return money >= beverage.getPrice() ? true : false;}
	public int returnMoney(int money, Beverage beverage) {return money - beverage.getPrice();}
	public void saleBeverage(Beverage beverage) {beverage.setStock(beverage.getStock()-1);};
	
	
}