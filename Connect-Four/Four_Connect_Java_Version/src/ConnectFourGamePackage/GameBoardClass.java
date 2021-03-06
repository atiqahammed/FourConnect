package ConnectFourGamePackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GameBoardClass {
	
	private ArrayList< ArrayList< String > > gameBoardArray  = new ArrayList<>();	
	private final static int NUMBER_OF_ROW=6;
	private final static int NUMBER_OF_COL=7;
	private final static String EMPTY_BOARD_VALUE = ".";
	private final static String PC_DICE = "O";
	private final static String USER_DICE = "X";
	
	
	public static int getNumberOfRow() {
		return NUMBER_OF_ROW;
	}

	public static int getNumberOfCol() {
		return NUMBER_OF_COL;
	}

	public static String getEmptyBoardValue() {
		return EMPTY_BOARD_VALUE;
	}

	public static String getPcDice() {
		return PC_DICE;
	}

	public static String getUserDice() {
		return USER_DICE;
	}

	public String getDice(int row,int column) {
		return this.gameBoardArray.get(row).get(column);
	}
	
	public void setDice(int row,int column,String dice) {
		this.gameBoardArray.get(row).set(column, dice);
		return;
	}
	
	
	
	public GameBoardClass getACopyOfGameBoardClass() {
		
		GameBoardClass copyGameBoardClass = new GameBoardClass();
		
		ArrayList< ArrayList< String > > newGameBoardArray  = new ArrayList<>();	
		
		for(int i=0;i<NUMBER_OF_ROW;i++) {
			
			ArrayList<String> temp = new ArrayList<>();
			
			for(int j=0;j<NUMBER_OF_COL;j++) temp.add(this.gameBoardArray.get(i).get(j));
			
			newGameBoardArray.add(temp);
			
		}
		
		copyGameBoardClass.gameBoardArray = newGameBoardArray;
		
		
		return copyGameBoardClass;
	}
	
	
	public void createNewGameBoard() {
		
		
		
		for(int i=0;i<NUMBER_OF_ROW;i++) {
			
			ArrayList<String> tempArray = new ArrayList<>();
			
			for(int j=0;j<NUMBER_OF_COL;j++) tempArray.add(EMPTY_BOARD_VALUE);
			
			gameBoardArray.add(tempArray);
			
		}
		
		
		/*
		try {
			BufferedReader br = new BufferedReader(new FileReader("input.txt"));
			String line;
			
			
			while ((line = br.readLine()) != null) {
			
				String arr[] = line.split(" ");
				ArrayList<String> temp = new ArrayList<>();
				
				for(int i=0;i<arr.length;i++) temp.add(arr[i]);
				
				
				gameBoardArray.add(temp);
				
				//System.out.println(board.toString());
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}
	
	public int getIndexOfFirstElement(int columnNumber) {
		
		int index = -1;
		
		for(int i=0;i<NUMBER_OF_ROW;i++) {
			
			if( !gameBoardArray.get(i).get(columnNumber).equals(EMPTY_BOARD_VALUE)) {
				index = i;
				break;
			}
			
		}
		
		return index;
	}

	public int getEmptyIndexOfAColumn(int columnNumber) {
		
		int index=-1;
		
		for(int i=0;i<NUMBER_OF_ROW;i++) {
			
			if(gameBoardArray.get(i).get(columnNumber).equals(EMPTY_BOARD_VALUE)) index = i;
			else break;
		}
		
		return index;
	}
	
	
	public void printGameBoard() {
		
		for(int j=0;j<NUMBER_OF_COL;j++)  System.out.print(j+"\t" );

		System.out.println();
		
		for(int i=0;i<NUMBER_OF_ROW;i++) {
			
			for(int j=0;j<NUMBER_OF_COL;j++)  System.out.print( gameBoardArray.get(i).get(j)+"\t" );
			
			System.out.println();
			
		}
		
	}
	
	
	
	public void printFinalGameBoard() {
		
		System.out.print( " " );
		for(int j=0;j<NUMBER_OF_COL;j++)  System.out.print("  "+j+"   " );
		System.out.println();
		
		for(int i=0;i<NUMBER_OF_ROW;i++) {
			
			System.out.print( "|" );
			for(int j=0;j<NUMBER_OF_COL;j++)  System.out.print( "     "+"|" );
			System.out.println();
			
			System.out.print( "|" );
			for(int j=0;j<NUMBER_OF_COL;j++)  System.out.print( "  "+gameBoardArray.get(i).get(j)+"  "+"|" );
			System.out.println();
			
			System.out.print( "|" );
			for(int j=0;j<NUMBER_OF_COL;j++)  System.out.print( "_____"+"|" );
			System.out.println();
			
			
		}
	}
	

}
