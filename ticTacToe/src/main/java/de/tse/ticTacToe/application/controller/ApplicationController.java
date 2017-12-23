package de.tse.ticTacToe.application.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ApplicationController extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane mainPane = FXMLLoader.load(getClass().getResource("/fxml/Board.fxml"));
		Scene mainScene = new Scene(mainPane);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
