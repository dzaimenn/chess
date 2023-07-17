package com.dzaimenn.pieces;

import com.dzaimenn.game.Cell;
import com.dzaimenn.game.Color;
import com.dzaimenn.game.Piece;

public class Queen extends Piece {
    public Queen(Color color, Cell cell) {
        super(color, cell);
    }

    public Queen(Color color) {
        super(color);
    }
}
