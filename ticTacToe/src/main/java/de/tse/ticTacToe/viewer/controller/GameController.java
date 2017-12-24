package de.tse.ticTacToe.viewer.controller;

import de.tse.ticTacToe.viewer.data.GameDataHolder;
import de.tse.ticTacToe.viewer.elements.buttons.GameBoardButton;
import de.tse.ticTacToe.viewer.elements.eventHandler.GameBoardButtonEventHandler;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import lombok.Getter;

public class GameController {

	// TODO: add game model as singleton
	// TODO: add check for win condition
	// TODO: add turn order function with set of game
	// TODO: add controller for gametype choice
	// TODO: add ai oponent with random moves
	// TODO: add ai strategy by decision tree for tic tac toe
	// TODO: add sockets for network communication
	// TODO: add network communication

	@Getter
	private final GameDataHolder dataHolder = new GameDataHolder();

	@FXML
	@Getter
	private Text gameStatus;

	@FXML
	@Getter
	private GridPane gameBoard;

	private final GameBoardButtonEventHandler boardButtonEventHandler = new GameBoardButtonEventHandler(this);

	@FXML
	public void onStartNewGame() {
		init();
	}

	public void init() {
		dataHolder.initGameData();

		// TODO: create text according to game state
		gameStatus.setText("Player " + dataHolder.getGameModel().getPlayerSymbol() + " turn.");

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				GameBoardButton button = new GameBoardButton(x, y);
				button.setOnMouseClicked(boardButtonEventHandler);
				button.setPrefHeight(150);
				button.setPrefWidth(150);
				gameBoard.add(button, x, y);
			}
		}
	}

}
