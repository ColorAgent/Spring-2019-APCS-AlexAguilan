
public class pandaExpress extends Chinese{
	private int numOfMarkets = 0;
	private double avgPrice = 0.0;
	private boolean MSG = true;
	public pandaExpress(int num, double price) {
		super(36, "fried rice");
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
	public void setMSG() {
		MSG = false;
	}
}
