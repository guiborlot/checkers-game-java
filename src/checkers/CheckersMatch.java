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

    private void initialSetup() {
        board.placePiece(new Pawn(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new Pawn(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new Pawn(board, Color.WHITE), new Position(7, 4));
    }
}
