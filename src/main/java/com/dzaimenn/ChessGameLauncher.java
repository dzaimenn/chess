package com.dzaimenn;

import com.dzaimenn.ui.ChessBoard;
import com.dzaimenn.ui.ChessBoardWithLabels;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ChessGameLauncher extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        ChessBoard chessBoard = new ChessBoard();
        ChessBoardWithLabels chessBoardWithLabels = new ChessBoardWithLabels(chessBoard);

        BorderPane root = new BorderPane();
        root.setCenter(chessBoardWithLabels);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Chess");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
