package ConnectFourGamePackage;

public class EvalutionClass {

	private final static int DIRECTION=8; 
	private final static int fx[]={0,0,1,-1,-1,1,-1,1};
	private final static int fy[]={-1,1,0,0,1,1,-1,-1};
	
	private final static int fxx[]={0,-1,-1,-1};
	private final static int fyy[]={-1,0,-1,1};
	
	private GameBoardClass gameBoard;
	private int currentXCoordinate,currentYCoordinate,count;
	
	public int getTheValueOfEvalutionFunction(GameBoardClass gameBoard) {
		
		this.gameBoard = gameBoard;
		int firstElementRowPosition;
		int value = 0;
	
		for(int i=0; i<gameBoard.getNumberOfCol(); i++) {		
			firstElementRowPosition = gameBoard.getIndexOfFirstElement(i);
			//System.out.println(firstElementRowPosition);
			
			//System.out.println("check position "+i+"     "+firstElementRowPosition);
			
			if( firstElementRowPosition != -1 ) {
				value += getTheEvalutingValueOfThePostion(firstElementRowPosition, i) ;
				//System.out.println( i+" /////??//// "+getTheEvalutingValueOfThePostion(firstElementRowPosition,i) );
			}
		}
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhh   "+value );
		return value;
	}
	
	
	

	private int getTheEvalutingValueOfThePostion(int row, int column) {
		
		//System.out.println("row " +row +", col " + column);
		String evalutingDice = gameBoard.getDice(row, column);
		int value = 0,space,opponent;
		
		GameBoardClass newCopyOfGameBoard = gameBoard.getACopyOfGameBoardClass();
		newCopyOfGameBoard.setDice(row, column, ".");
		
		if(new TakeChanceOrDefence(newCopyOfGameBoard).shouldTakeChanceOrDefence(column, ".")) 
			value += 2;
		if(new TakeChanceOrDefence(newCopyOfGameBoard).shouldTakeChanceOrDefence(column, "X")) 
			value += 200;
		if(new TakeChanceOrDefence(newCopyOfGameBoard).shouldTakeChanceOrDefence(column, "O")) 
			value += 400;
		if(new TakeChanceOrDefence(newCopyOfGameBoard).shouldTakeChanceOrDefence2(column, "O")) 
			value += 5;
		if(new TakeChanceOrDefence(newCopyOfGameBoard).shouldTakeChanceOrDefence2(column, "X")) 
			value += 50;
		if(new TakeChanceOrDefence(newCopyOfGameBoard).shouldTakeChanceOrDefence3(column, "0")) 
			value += 20;
		if(new TakeChanceOrDefence(newCopyOfGameBoard).shouldTakeChanceOrDefence4(column, "X")) 
			value += 8;
		
		
		/*
		for(int i=0;i<=3;i++) {
			gameBoard.executeDirectionalCount(column, row, i);
			value += getValue(gameBoard.getEvalutingDiceCount()+1, gameBoard.getEmptySpaceCount());
			opponent = gameBoard.getOpponentDiceCount();
			space = gameBoard.getEmptyOpponentSpaceCount();
			
			if (opponent==2 && space>=0) value += 3;
			else if(opponent==3 && space >= 0) value+= 10;
		}*/
		
		
		//System.out.println(">> value "+ value);
		return value;
	}
	
	
	int getValue(int count, int space) {
		
		//if(opponent ==3 ) return 1000;
		if(count==3 && space==0 ) return 0;
		else if(count ==3 && space>=2 ) return 40;
		else if(count ==3 && space==1 ) return 20;
		else if(count ==2 && space==0 ) return 0;
		else if(count ==2 && space==2 ) return 10;
		else if(count ==2 && space==1 ) return 0;
		else if(count ==2 && space>=3 ) return 10;
		else if(count ==1 && space>=3 ) return 1;
		else if(count ==4 ) return 10000;
		return 0;
	}
	
	
}
