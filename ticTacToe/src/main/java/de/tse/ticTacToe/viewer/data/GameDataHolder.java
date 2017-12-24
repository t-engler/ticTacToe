package de.tse.ticTacToe.viewer.data;

import de.tse.ticTacToe.application.model.TicTacToeGameModel;
import lombok.Getter;

public class GameDataHolder {
	
	@Getter
	private final TicTacToeGameModel gameModel = TicTacToeGameModel.retrieveGameModel();

	public void initGameData() {
		gameModel.reset();		
	}

}
