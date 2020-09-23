package checkers;

import boardgame.Board;

public class CheckersMatch {

    private Board board;

    public CheckersMatch() {
        board = new Board(8,8);
    }

    //Retorna uma matriz com todas as peças
    public CheckersPiece[][] getPieces() {
        CheckersPiece[][] mat = new CheckersPiece[board.getRows()][board.getColumns()];
        for(int i=0; i<board.getRows(); i++) {
            for(int j=0; j<board.getColumns(); j++) {
                mat[i][j] = (CheckersPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}
