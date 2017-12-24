package de.tse.ticTacToe.application.model;

import com.google.common.collect.Table;
import com.google.common.collect.TreeBasedTable;

import lombok.Getter;

public class TicTacToeGameModel {

	private static final int BOARDSIZE = 3;
	private static final String PLAYER_X = "X";
	private static final String PLAYER_Y = "Y";

	@Getter
	private String playerSymbol = PLAYER_X;

	private Table<Integer, Integer, GameCell> gameBoard = TreeBasedTable.create();

	private static TicTacToeGameModel gameModel;

	private TicTacToeGameModel() {

	}

	public static TicTacToeGameModel retrieveGameModel() {
		if (gameModel == null) {
			initGameModel();
		}

		return gameModel;
	}

	private static void initGameModel() {
		gameModel = new TicTacToeGameModel();
		gameModel.reset();
	}

	public void reset() {
		gameBoard.clear();
		for (int x = 0; x < BOARDSIZE; x++) {
			for (int y = 0; y < BOARDSIZE; y++) {
				gameBoard.put(x, y, new GameCell());
			}
		}

		playerSymbol = PLAYER_X;
	}

	public String makeMove(int x, int y) {
		String movePlayerSymbol = playerSymbol;
		
		switchPlayerSymbol();

		return movePlayerSymbol;
	}

	private void switchPlayerSymbol() {
		if (PLAYER_X.equalsIgnoreCase(playerSymbol)) {
			playerSymbol = PLAYER_Y;
		} else {
			playerSymbol = PLAYER_X;
		}
	}
}
