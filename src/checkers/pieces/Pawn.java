package checkers.pieces;

import boardgame.Board;
import checkers.CheckersPiece;
import checkers.Color;

public class Pawn extends CheckersPiece{

    public Pawn(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString() {
        return "P";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
