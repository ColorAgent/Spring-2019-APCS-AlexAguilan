//@author Alex Aguilan
//@version date
package textExcel;

public class RealCell implements Cell {
	private String input;
	
	public RealCell(String userInput) {
		this.input = userInput;
	}
	// text for spreadsheet cell display, must be exactly length 10
	public String abbreviatedCellText() {
		return (input + ("          ")).substring(0,10);
	}
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		return input;
	}
	public Double getDoubleValue() {
		return Double.parseDouble("input");
	}
}
