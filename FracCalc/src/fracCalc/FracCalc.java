package fracCalc;

import java.util.Arrays;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner UserInputs = new Scanner(System.in);
		boolean Continue = true;
		System.out.println("Welcome to FracCalc");
        
		//Reads the input from the user and call produceAnswer with an equation
		//ask user for variables and does things
		
		while(Continue){
			String Input = UserInputs.next();
			System.out.println(produceAnswer(Input));	
			//ask the user if the user wants to quit and closes the loop if yes
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			if(UserInputs.next().equals("quit")){
				Continue = false;
				UserInputs.close();
			}
		}
    }
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        Fraction Integer.parseInt(Equation) = new Fraction();
        
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
