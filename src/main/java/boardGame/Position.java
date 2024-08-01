package boardGame;

public class Position {

    private Integer row, column;

    public Position() {
    }

    public Position(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setValues (Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return "Position: " +
                "\nrow: " + row +
                "\ncolumn: " + column;
    }
}
