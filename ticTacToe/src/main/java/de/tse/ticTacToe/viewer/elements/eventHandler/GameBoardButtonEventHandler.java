package de.tse.ticTacToe.viewer.elements.eventHandler;

import de.tse.ticTacToe.viewer.elements.buttons.GameBoardButton;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class GameBoardButtonEventHandler implements EventHandler<MouseEvent>{
	@Override
	public void handle(MouseEvent event) {
		GameBoardButton pressedButton = (GameBoardButton) event.getSource();
		pressedButton.setText(""+pressedButton.getXCoordinate()+pressedButton.getYCoordinate());
	}
}
