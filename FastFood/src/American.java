public class American extends FastFood{
private int age = 0;
private String typeOfFood;
public American(int yearEat, String food) {
		super(1250.0, "America");
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
