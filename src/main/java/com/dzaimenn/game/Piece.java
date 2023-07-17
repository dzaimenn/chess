package com.dzaimenn.game;

/**
 * Piece is an abstract class that represents a generic piece on a chess board.
 * It includes methods and properties that all pieces (pawn, rook, etc.) have in common.
 */

public abstract class Piece {
    public final Color color;
    public Cell cell;

    public Piece(Color color, Cell cell) {
        this.color = color;
        this.cell = cell;
    }

    public Piece(Color color) {
        this.color = color;
    }
}
