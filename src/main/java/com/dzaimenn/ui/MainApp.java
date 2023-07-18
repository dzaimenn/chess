package com.dzaimenn.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {



    @Override
    public void start(Stage stage) {
        ChessBoardView chessBoardView = new ChessBoardView();

        Scene scene = new Scene(chessBoardView.getChessBoard(), 560, 560);
        stage.setScene(scene);
        stage.setTitle("Chess Board");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
