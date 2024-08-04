package chessLayer;

import boardLayer.Board;
import boardLayer.Piece;
import chessLayer.enums.Color;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
}
