
public class tacoBell extends Mexican{
	private int numOfMarkets = 0;
	private double avgPrice = 0.0;
	private boolean spice = true;
	public tacoBell(int num, double price) {
		super(56, "taco");
		numOfMarkets = num;
		avgPrice = price;
	}
	public int getMarket() {
		return numOfMarkets;
	}
	public double getPrice() {
		return avgPrice;
	}
	public void setMarket(int market) {
		numOfMarkets = market;
	}
	public void setPrice(double price) {
		avgPrice = price;
	}
	public void setSpice() {
		spice = false;
	}

}
