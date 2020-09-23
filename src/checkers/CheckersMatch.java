package checkers;

import boardgame.Board;
import boardgame.Position;
import checkers.pieces.Pawn;

public class CheckersMatch {

    private Board board;

    public CheckersMatch() {
        board = new Board(8,8);
        initialSetup();
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

    private void placeNewPiece(char column, int row, CheckersPiece piece) {
        board.placePiece(piece, new CheckersPosition(column, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('b', 6, new Pawn(board, Color.WHITE));
        placeNewPiece('e', 8, new Pawn(board, Color.BLACK));
        placeNewPiece('e', 1, new Pawn(board, Color.WHITE));
    }
}
