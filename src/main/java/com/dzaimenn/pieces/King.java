package com.dzaimenn.pieces;

import com.dzaimenn.game.Cell;
import com.dzaimenn.game.Color;
import com.dzaimenn.game.Piece;

public class King extends Piece {
    public King(Color color, Cell cell) {
        super(color, cell);
    }

    public King(Color color) {
        super(color);
    }
}
