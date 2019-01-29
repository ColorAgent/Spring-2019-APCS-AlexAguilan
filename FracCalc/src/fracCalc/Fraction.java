package fracCalc;
//kappa
public class Fraction {
	private String operator;
	private int defaultwhole;
	private int defaultnumerator;
	private int defaultdenominator;
	private String fraction1;
	private int numerator1;
	private int denominator1;
	private String fraction2;
	private int numerator2;
	private int denominator2;
	private String answer;

	//default fraction variables
	public Fraction() { 
		this.defaultwhole = 0;
		this.defaultnumerator = 0;
		this.defaultdenominator = 1;
	}
	//converts the first and second fractions into improper numbers
	public Fraction(String op) {
		//include code to parse the string and set the values for the fields
		//cut into 3 strings
		String[] fraction = op.split(" ");
		this.operator = fraction[1];
		String operand1  = fraction[0];
		String[] fraction1parts = operand1.split("[_/]");
		int whole1 = 0;
		int numerator1 = 0;
		int denominator1 = 0;
		// checks the first fraction to determine if its a fraction or whole number
		if (fraction1parts.length < 2) {
			whole1 = Integer.parseInt(fraction1parts[0]);
			numerator1 = defaultnumerator;         
			denominator1 = defaultdenominator;
		}
		if (fraction1parts.length > 1) {
			String[] NoWholeArray = operand1.split("[_/]");
			if (operand1.contains("_")) {
				whole1 = Integer.parseInt(fraction1parts[0]);
				numerator1 = Integer.parseInt(fraction1parts[1]);
				denominator1 = Integer.parseInt(fraction1parts[2]);
			} else {
				whole1 = defaultwhole;
				numerator1 = Integer.parseInt(NoWholeArray[0]);
				denominator1 = Integer.parseInt(NoWholeArray[1]);
			}
		}
		// converts the whole, numerator, and denominator into the 1st improper frac
		String improperfrac1 = toImproperFrac(whole1, numerator1, denominator1);
		String[] improper1parts = improperfrac1.split("/");
		int impropernum1 = Integer.parseInt(improper1parts[0]);
		int improperdenom1 = Integer.parseInt(improper1parts[1]);
		if (operand1.contains("-")){
			if (impropernum1 < 0) {
				impropernum1 = impropernum1;
			} else
			impropernum1 = absValue(impropernum1);
		}
		//turns them into integers --> store in the fields
		this.fraction1 = impropernum1 + "/" + improperdenom1;
		this.numerator1 = impropernum1;
		this.denominator1 = improperdenom1;

				
		String operand2 = fraction[2];
		String[] fraction2parts = operand2.split("[_/]");
		int whole2 = 0;
		int numerator2 = 0;
		int denominator2 = 0;
		// checks the 2nd fraction to see if its a whole num or fraction
		if (fraction2parts.length < 2) {
			whole2 = Integer.parseInt(fraction2parts[0]);
			numerator2 = defaultnumerator;         
			denominator2 = defaultdenominator;
		}
		if (fraction2parts.length > 1) {
			String[] NoWholeArray = operand2.split("[_/]");
			if (operand2.contains("_")) {
				whole2 = Integer.parseInt(fraction2parts[0]);
				numerator2 = Integer.parseInt(fraction2parts[1]);
				denominator2 = Integer.parseInt(fraction2parts[2]);
			} else {
				whole2 = defaultwhole;
				numerator2 = Integer.parseInt(NoWholeArray[0]);
				denominator2 = Integer.parseInt(NoWholeArray[1]);
			}
		}
		// converts the whole, numerator, and denominator into the 2nd improper frac
		String improperfrac2 = toImproperFrac(whole2, numerator2, denominator2);
		String[] improper2parts = improperfrac2.split("/");
		int impropernum2 = Integer.parseInt(improper2parts[0]);
		int improperdenom2 = Integer.parseInt(improper2parts[1]);
		if (operand2.contains("-")){
			impropernum2 = absValue(impropernum2);
			if (impropernum2 < 0) {
				impropernum2 = impropernum2;
			} else
			impropernum2 = absValue(impropernum2);
		}
		//turns them into integers --> store in the fields
		this.fraction2 = impropernum2 + "/" + improperdenom2;
		this.numerator2 = impropernum2;
		this.denominator2 = improperdenom2;
	}
	// Does the math and returns the answer
	public String Math(String op) {
		//do the math to add fractions
		if (denominator1 != denominator2) {
			if (operator.contains("-")) {
				int answerNum = (numerator2 * denominator1) - (numerator1 * denominator2);
				int NewDenom = denominator1 * denominator2;
				if (fraction1.contains("-") && fraction2.contains("-")) {
					answerNum = answerNum * -1;
				}
				this.answer = answerNum + "/" + NewDenom;
			}
			if (operator.contains("+")) {
				int answerNum = (numerator1 * denominator2) + (numerator2 * denominator1);
				int NewDenom = denominator1 * denominator2;
				this.answer = answerNum + "/" + NewDenom;
			}
			if (operator.contains("*")) {
				int answerNum = numerator1 * numerator2;
				int NewDenom = denominator1 * denominator2;
				this.answer = answerNum + "/" + NewDenom;
			}
			if (operator.contains("/")) {
				int answerNum = numerator1 * denominator2;
				int NewDenom = numerator2 * denominator1;
				this.answer = answerNum + "/" + NewDenom; //you can simplify
			}
		}
		if (denominator1 == denominator2) {
			if (operator.contains("-")) {
				int answerNum = numerator1 - numerator2;
				this.answer = answerNum + "/" + denominator1;
			}
			if (operator.contains("+")) {
				int answerNum = numerator1 + numerator2;
				this.answer = answerNum + "/" + denominator1;
			}
			if (operator.contains("*")) {
				int answerNum = numerator1 * numerator2;
				this.answer = answerNum + "/" + denominator1;
			}
			if (operator.contains("/")) {
				int answerNum = numerator1 * denominator2;
				int NewDenom = numerator2 * denominator1;
				this.answer = answerNum + "/" + NewDenom; //you can simplify
			}
		}
		return answer;
	}
	// gets the operator
	public String GetOp() {
		return operator;
	}
	// gets the answer
	public String GetAnswer() {
		return answer;
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
