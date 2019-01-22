package fracCalc;

public class Fraction {
	private int whole;
	private String sign;
	private int numerator;
	private int denominator;
	private String Fraction;
	private Fraction answer1;

	public Fraction() { 
		whole = 0;
		numerator = 0;
		denominator = 1;
	}
	public Fraction(String op) {
		//include code to parse the string and set the values for the fields
		//cut into 3 strings
		//turns them into integers --> store in the fields
		// make improper
	}
	// I do math by solving equations
	public Fraction math(Fraction op2) {
		//do the math to add fractions
		
		Fraction answer = new Fraction();
		//get common denom
		//add the numerators
		
		//set answers values
		return answer1;
	}
	// turns the mixed number into an improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		String answer;
		if (whole < 0) {
			whole = whole * -1;
		}
		answer = ((whole*denominator + numerator) + "/" + denominator);
		return answer;
		}
		//returns the absolute value of the input
	public static int absValue(int num) {	
			return num *-1;
		}
		//changes an improper fraction in the form of the integers into a mixed number and returns it
	public static String toMixedNum(int numerator, int denominator) {
			String answer;
			answer = (numerator / denominator + "_" + numerator % denominator + "/" + denominator);
			return answer;
		}
	}
