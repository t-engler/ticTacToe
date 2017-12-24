package de.tse.ticTacToe.viewer.elements.eventHandler;

import de.tse.ticTacToe.viewer.controller.GameController;
import de.tse.ticTacToe.viewer.data.GameDataHolder;
import de.tse.ticTacToe.viewer.elements.buttons.GameBoardButton;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class GameBoardButtonEventHandler implements EventHandler<MouseEvent> {

	private final GameController gameController;

	public GameBoardButtonEventHandler(GameController gameController) {
		this.gameController = gameController;
	}

	@Override
	public void handle(MouseEvent event) {
		GameBoardButton pressedButton = (GameBoardButton) event.getSource();
		// TODO: add x or y respective to game state
		pressedButton.setText(gameController.getDataHolder().getGameModel().makeMove(pressedButton.getXCoordinate(),
				pressedButton.getYCoordinate()));
		gameController.getGameStatus()
				.setText("Player " + gameController.getDataHolder().getGameModel().getPlayerSymbol() + " turn.");
		// TODO: delegate to game contoller
		// TODO: add game controller and game model
		pressedButton.setDisable(true);
	}
}
