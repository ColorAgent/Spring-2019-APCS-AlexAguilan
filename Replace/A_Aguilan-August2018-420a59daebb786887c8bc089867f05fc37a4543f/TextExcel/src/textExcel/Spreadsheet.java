package textExcel;

import java.util.Arrays;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
    private Cell[][] sheet;
    private int numOfRows;
    private int numOfCols;
    //constructor
    public Spreadsheet() {
        //initialize a 20 array of EmptyCells
        //+1 array for headers and stuff
        numOfRows = 20;
        numOfCols = 12;
        sheet = new Cell [numOfRows][numOfCols];
        for(int r = 0; r<numOfRows; r++) {
            for(int c = 0; c<numOfCols; c++) {
                // rows columns
                sheet[r][c] = new EmptyCell();
            }
        }
    }
    @Override
    public String processCommand(String command) {

        String[] commandInspector = command.split(" ", 3);
        //cell inspection
        if(command.length() <= 3) {
            return getCell(new SpreadsheetLocation(command)).fullCellText();
        }
        if(command.contains("=")) {
            SpreadsheetLocation location = new SpreadsheetLocation(commandInspector[0]);
            TextCell newCell = new TextCell(commandInspector[2]);
            sheet[location.getRow()][location.getCol()] = newCell;
        }
        // clears specific cell
        if(command.toLowerCase().contains("clear ")) {
            SpreadsheetLocation location = new SpreadsheetLocation(commandInspector[1]);
            sheet[location.getRow()][location.getCol()] = new EmptyCell();
        } else {
            if (command.toLowerCase().equals("clear")) {
                for(int i = 0; i < 20; i++) {
                    for(int j = 0; j < 12; j++) {
                        sheet [i][j] = new EmptyCell();
                    }
                }
            }
        }
        if(command.contains("%")) {
        	SpreadsheetLocation location = new SpreadsheetLocation(commandInspector[0]);
        	PercentCell newCell = new PercentCell(commandInspector[2]);
        	sheet[location.getRow()][location.getCol()] = newCell;
        }
        return getGridText();
    }

    @Override
    public int getRows()
    {
        return numOfRows;
    }

    @Override
    public int getCols()
    {
        // TODO Auto-generated method stub
        return numOfCols;
    }

    @Override
    public Cell getCell(Location loc) {
        return sheet[loc.getRow()][loc.getCol()];
    }

    @Override
    public String getGridText(){
        String grid = "   |";
        for(int m = 0; m < numOfCols; m++) {
            grid = grid + (char)(m + 'A') + "         |";
        }
        for(int c = 1; c <= numOfRows; c++) {
            if(c < 10) {
                grid = grid + "\n" + c + "  |";
            }else {
                grid = grid + "\n" + c + " |";
            }
            
        for(int r = 0; r < numOfCols; r++) {
        	grid = grid + sheet[c-1][r].abbreviatedCellText() + "|";
            }
        }
        return grid + "\n";
    }
}


