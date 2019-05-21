package textExcel;

import java.io.FileNotFoundException;
import java.util.*;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
	    // Add your command loop here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value here");
		String userInput = scanner.nextLine();
		while(!userInput.equals("quit")) {
			Spreadsheet tuna = new Spreadsheet();
			System.out.println(tuna.processCommand(userInput));
		// 
		// 
		// 
		
			System.out.println("Enter a command");
			userInput = scanner.nextLine();
		}
		scanner.close();
	}
}
