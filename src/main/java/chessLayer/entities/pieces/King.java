package chessLayer.entities.pieces;

import boardLayer.entities.Board;
import chessLayer.entities.ChessPiece;
import chessLayer.enums.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
