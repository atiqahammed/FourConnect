package ConnectFourGamePackage;

import java.io.IOException;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		///GameBoardClass gbc = new GameBoardClass();
		//gbc.createNewGameBoard();
		//gbc.printFinalGameBoard();
		
		
		//TakeChanceOrDefence defence = new TakeChanceOrDefence(gbc);
		
		
		//if(defence.shouldTakeChanceOrDefence(2, gbc.getUserDice()))
		//	System.out.println("paichi");
		
		/*for(int i = 0; i < 7; i++) {
			gbc.printFinalGameBoard();
			if(defence.shouldDefence(i))
				System.out.println("paichi ekta ");
			
		}*/
		
		//MiniMaxClass mmc = new MiniMaxClass();
		
		
		
		//System.out.println(mmc.getNextMove(gbc, 1));
		
		//EvalutionClass ec = new EvalutionClass();
		//ec.getTheValueOfEvalutionFunction(gbc);
		
		PlayGameClass pgc = new PlayGameClass();
		
		pgc.startGame();
		
	}

}
