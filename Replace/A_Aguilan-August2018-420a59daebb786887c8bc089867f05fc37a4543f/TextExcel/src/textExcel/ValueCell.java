package textExcel;

public class ValueCell extends RealCell{
	private String value;
	
	public ValueCell(String input) {
		super(input);
	}
	public String abbreviatedCellText() {
		return value.substring(0,10);
	}
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		return value;
	}
}
