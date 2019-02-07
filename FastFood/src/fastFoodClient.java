

public class fastFoodClient {
	public static void main(String[] args) {
		mcDonalds california = new mcDonalds(0, 0);
		california.setMarket(1165);
		california.setPrice(3);
		System.out.println("McDonald's in California is a fast food restaurant that sells "
				+  california.getType() + " and has " + california.getMarket() + " markets with an average price of $" + california.getPrice() + ".");
	}
}

