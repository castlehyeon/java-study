package kr.or.kosa;

public class Beverage2 {
	
	private int control; //key
    private String name;
    private int price;
    int reserves; //보유량(상태정보)

    public Beverage2(int control, String name , int price){
    	this.name = name;
    	this.price = price;
    	this.reserves = 10;
    }
    
    public void minusCount(){
    	reserves--;
	}
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getReserves() {
        return reserves;
    }

    public void setReserves(int reserves) {
        this.reserves = reserves;
    }
}