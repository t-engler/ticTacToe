package de.tse.ticTacToe.viewer.elements.buttons;

import javafx.scene.control.Button;
import lombok.Getter;

public class GameBoardButton extends Button {

	@Getter
	private final int xCoordinate;
	
	@Getter
	private final int yCoordinate;
	
	public GameBoardButton(int x, int y) {
		xCoordinate = x;
		yCoordinate = y;
	}

}
