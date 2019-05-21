package textExcel;

public class TextCell implements Cell{
	private String text;
	private String fullText;
	
	public TextCell(String text) {
		this.text = text;
		this.fullText = text;
	}
	
	@Override
	public String abbreviatedCellText() {
		// removes the ?
		if(text.contains("\"")) {
			text = text.substring(1, text.length() - 1);
		}
		// fills in the cell if its less than 10 spaces
		if(text.length() < 10) {
			for(int i = text.length(); i < 10; i++) {
				text = text + " ";
			}
		// otherwise returns cell as normal
		}else {
			text = text.substring(0, 10);
		}
		return text;
	}

	@Override
	public String fullCellText() {
		return fullText;
	}

}