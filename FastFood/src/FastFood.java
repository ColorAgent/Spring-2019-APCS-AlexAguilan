

public class FastFood {
	private double avgCalorie = 0.0;
	private String foodOrigin;
	public FastFood (double calorie, String place) {
	avgCalorie = calorie;
	foodOrigin = place;
	}
	public double getCalorie() {
		return avgCalorie;
	}
	public String getOrigin() {
		return foodOrigin;
	}
}
