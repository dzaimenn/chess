package com.dzaimenn.ui;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ChessBoardWithLabels extends BorderPane {
    private final String[] FILE_LABELS = {"A", "B", "C", "D", "E", "F", "G", "H"};
    private final String[] RANK_LABELS = {"8", "7", "6", "5", "4", "3", "2", "1"};

    public ChessBoardWithLabels(ChessBoard chessBoard) {
        this.setCenter(chessBoard);
        this.setTop(createFileLabels());
        this.setBottom(createFileLabels());
        this.setLeft(createRankLabels());
        this.setRight(createRankLabels());

    }

    private HBox createFileLabels() {
        HBox fileLabels = new HBox();
        fileLabels.setAlignment(Pos.CENTER);
        for (String fileLabel : FILE_LABELS) {
            Label label = new Label(fileLabel);
            label.setMinWidth(70);
            fileLabels.getChildren().add(label);
        }
        return fileLabels;
    }

    private VBox createRankLabels() {
        VBox rankLabels = new VBox();
        rankLabels.setAlignment(Pos.CENTER);
        for (String rankLabel : RANK_LABELS) {
            Label label = new Label(rankLabel);
            label.setMinWidth(70);
            rankLabels.getChildren().add(label);
        }

        return rankLabels;
    }

}
