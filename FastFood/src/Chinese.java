
public class Chinese extends FastFood {
	private int age = 0;
	private String typeOfFood = " ";
	public Chinese(int yearEat, String food) {
		super(750.0, "China");
		age = yearEat;
		typeOfFood = food;
}
	public int getAge() {
		return age;
	}
	public String getType() {
		return typeOfFood;
	}
}
