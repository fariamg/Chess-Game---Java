package chessLayer.entities.pieces;

import boardLayer.entities.Board;
import chessLayer.entities.ChessPiece;
import chessLayer.enums.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
