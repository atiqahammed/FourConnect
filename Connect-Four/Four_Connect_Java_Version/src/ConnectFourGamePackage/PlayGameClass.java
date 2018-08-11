package ConnectFourGamePackage;

import java.io.IOException;
import java.util.Scanner;



public class PlayGameClass {

	int index;
	
	public void startGame()  {
		
		GameBoardClass gbc = new GameBoardClass();
		gbc.createNewGameBoard();
		
		gbc.printFinalGameBoard();
		
		int i=0;
		
		while(i<21) {
			index = userTurn();
			gbc.setDice(gbc.getEmptyIndexOfAColumn(index), index, gbc.getUserDice());
			gbc.printFinalGameBoard();
			
			
			index = computerTurn(gbc);
			gbc.setDice(gbc.getEmptyIndexOfAColumn(index), index, gbc.getPcDice());
			gbc.printFinalGameBoard();
			i++;
		}
		

		
	}
	
	private int userTurn() {
		// TODO Auto-generated method stub
		System.out.print("Enter an Index : ");
		Scanner sc = new Scanner(System.in);
		int ind = sc.nextInt();
		
		return ind;
	}
	
	
	private int computerTurn(GameBoardClass gbc)  {
		// TODO Auto-generated method stub
		System.out.println("computer turn : ");
		MiniMaxClass mmc = new MiniMaxClass();
		
		//int col1 = mmc.getNextMove(gbc,5);
		int col2 = mmc.getNextMove(gbc,1);
		
		//int col3 = mmc.getNextMove(gbc,1);
		
		//System.out.println(col1+ "  /////////////  "+ col2+"   ////////////////  "+col3);
		
		return col2;
	}
}
