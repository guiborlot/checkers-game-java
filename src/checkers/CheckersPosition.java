package checkers;

import boardgame.Position;

public class CheckersPosition {
    private char column;
    private int row;
    public CheckersPosition(char column, int row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new CheckersException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
        }
        this.column = column;
        this.row = row;
    }
    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    /* Lembrando que ('a' - 'b' = 1) e assim por diante, então para
     * setar a posição no tabuleiro em relação a matriz o método pega
     * 8 - row e column - o caractere 'a'*/
    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    protected static CheckersPosition fromPosition(Position position) {
        return new CheckersPosition((char)('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}