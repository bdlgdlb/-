public class Exercise09_02{
	public static void main(String[] args) {
		Stock myStock = new Stock("ORCL","Oracle Corporation");
		myStock.setPreviousClosingPrice(34.5);
		myStock.setCurrentPrice(34.35);
		System.out.println("Price change " + myStock.getChangePercent() * 100 + "%");
	}
}

class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	Stock(){

	}

	Stock(String symbol, String name){
		this.symbol =symbol;
		this.name = name;
	}

	public double getChangePercent(){
		return (  currentPrice - previousClosingPrice) / previousClosingPrice;
	}

	public double getPreviousClosingPrice(){
		return previousClosingPrice;
	}

	public double getCurrentPrice(){
		return currentPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice){
		this.previousClosingPrice = previousClosingPrice;
	}

	public void setCurrentPrice(double currentPrice){
		this.currentPrice = currentPrice;
	}
}