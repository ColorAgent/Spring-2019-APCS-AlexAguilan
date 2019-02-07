
public class Mexican extends FastFood {
	private int age = 0;
	private String typeOfFood = " ";
	public Mexican(int yearEat, String food) {
		super(1000.0, "Mexico");
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
