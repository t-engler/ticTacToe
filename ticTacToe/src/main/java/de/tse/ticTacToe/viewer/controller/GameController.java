package de.tse.ticTacToe.viewer.controller;

import de.tse.ticTacToe.viewer.elements.buttons.GameBoardButton;
import de.tse.ticTacToe.viewer.elements.eventHandler.GameBoardButtonEventHandler;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import lombok.Getter;

public class GameController {

	@FXML
	@Getter
	private Text gameStatus;

	@FXML
	@Getter
	private GridPane gameBoard;

	private final GameBoardButtonEventHandler boardButtonEventHandler = new GameBoardButtonEventHandler();

	@FXML
	public void onStartNewGame() {
		init();
	}

	public void init() {
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				GameBoardButton button = new GameBoardButton(x, y);
				button.setOnMouseClicked(boardButtonEventHandler);
				gameBoard.add(button, x, y);
			}
		}
	}

}
