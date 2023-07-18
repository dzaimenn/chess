package com.dzaimenn.pieces;

import com.dzaimenn.game.Cell;
import com.dzaimenn.game.Color;
import com.dzaimenn.game.Piece;


public class Pawn extends Piece {
    public Pawn(Color color, Cell cell) {
        super(color, cell);
    }

    public Pawn(Color color) {
        super(color);
    }
}
