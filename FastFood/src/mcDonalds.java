
public class mcDonalds extends American{
	private int numOfMarkets = 248;
	private double avgPrice = 2.5;
	private boolean sugar = true;
	public mcDonalds(int num, double price) {
		super(63, "burger");
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
	public void setSugar() {
		sugar = false;
	}
}
