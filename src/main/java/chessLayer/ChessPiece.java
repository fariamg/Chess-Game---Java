package chessLayer;

import boardLayer.Board;
import boardLayer.Piece;
import chessLayer.enums.Color;

public abstract class ChessPiece extends Piece {

    private Color color;
    private Integer moveCount;

    public ChessPiece(Board board, Color color, Integer moveCount) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public Integer getMoveCount() {
        return moveCount;
    }


}
