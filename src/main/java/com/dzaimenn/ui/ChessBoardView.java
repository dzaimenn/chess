package com.dzaimenn.ui;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ChessBoardView {

    private GridPane chessBoard;

    public ChessBoardView() {
        chessBoard = new GridPane();
        createBoard();
    }

    private void createBoard() {
        for (int rankIndex = 0; rankIndex < 8; rankIndex++) {
            for (int fileIndex = 0; fileIndex < 8; fileIndex++) {
                Rectangle cell = new Rectangle(70, 70);
                if ((rankIndex + fileIndex) % 2 == 0) {
                    cell.setFill(Color.WHITE);
                } else {
                    cell.setFill(Color.BROWN);
                }
                chessBoard.add(cell, fileIndex, rankIndex);
            }
        }
    }

    public GridPane getChessBoard() {
        return chessBoard;
    }
}
