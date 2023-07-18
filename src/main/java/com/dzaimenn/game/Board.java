package com.dzaimenn.game;

import com.dzaimenn.pieces.*;
import java.util.HashMap;

public class Board {

    // Storing game pieces on board using HashMap
    HashMap<Cell, Piece> pieces = new HashMap<>();

    // This method places the piece on the board at the specified cell.
    public void setPieces(Cell cell, Piece piece) {
        piece.cell = cell;
        pieces.put(cell, piece);
    }

    // This method initializes the board with pieces at their initial positions.
    public void setupInitialBoardPosition() {

        // White pieces
        setPieces(Cell.A1, new Rook(Color.WHITE));
        setPieces(Cell.B1, new Knight(Color.WHITE));
        setPieces(Cell.C1, new Bishop(Color.WHITE));
        setPieces(Cell.D1, new Queen(Color.WHITE));
        setPieces(Cell.E1, new King(Color.WHITE));
        setPieces(Cell.F1, new Bishop(Color.WHITE));
        setPieces(Cell.G1, new Knight(Color.WHITE));
        setPieces(Cell.H1, new Rook(Color.WHITE));

        // White pawns
        for (Cell cell : Cell.values()) {
            // Note: Assuming that X-coordinate 1 corresponds to the second rank in Chess
            if (cell.getX() == 1) {
                setPieces(cell, new Pawn(Color.WHITE));
            }
        }

        // Black pieces
        setPieces(Cell.A8, new Rook(Color.BLACK));
        setPieces(Cell.B8, new Knight(Color.BLACK));
        setPieces(Cell.C8, new Bishop(Color.BLACK));
        setPieces(Cell.D8, new Queen(Color.BLACK));
        setPieces(Cell.E8, new Knight(Color.BLACK));
        setPieces(Cell.F8, new Bishop(Color.BLACK));
        setPieces(Cell.G8, new Knight(Color.BLACK));
        setPieces(Cell.H8, new Rook(Color.BLACK));

        // Black pawns
        for (Cell cell : Cell.values()) {
            // Note: Assuming that X-coordinate 6 corresponds to the seventh rank in Chess
            if (cell.getX() == 6) {
                setPieces(cell, new Pawn(Color.BLACK));
            }
        }

    }

}
