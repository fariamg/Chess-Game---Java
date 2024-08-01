package boardLayer;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private Integer rows, columns;
    private Piece[][] pieces;

    public Board(Integer rows, Integer columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    private Piece piece (Integer row, Integer column) {
        return pieces[row][column];
    }

    private Piece piece (Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }
}
