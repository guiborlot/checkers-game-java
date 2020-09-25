package checkers.pieces;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import checkers.CheckersMatch;
import checkers.CheckersPiece;
import checkers.Color;

import java.awt.*;

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

        Position p = new Position(0, 0);

        if(getColor() == Color.BLACK) {
            //SO
            p.setValues(position.getRow() + 1, position.getColumn() - 1);
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
                p.setRow(p.getRow() + 1);
                p.setColumn(p.getColumn() - 1);
            } else if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                p.setValues(position.getRow() + 2, position.getColumn() - 2);
                if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
                    mat[p.getRow()][p.getColumn()] = true;
                    p.setRow(p.getRow() + 2);
                    p.setColumn(p.getColumn() - 2);

                }
            }


            //SE
            p.setValues(position.getRow() + 1, position.getColumn() + 1);
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
                p.setRow(p.getRow() + 1);
                p.setColumn(p.getColumn() + 1);
            } else if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                p.setValues(position.getRow() + 2, position.getColumn() + 2);
                if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
                    mat[p.getRow()][p.getColumn()] = true;
                    p.setRow(p.getRow() + 2);
                    p.setColumn(p.getColumn() + 2);

                }
            }
        }

        if(getColor() == Color.WHITE) {
            //NO
            p.setValues(position.getRow() - 1, position.getColumn() - 1);
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
                p.setRow(p.getRow() - 1);
                p.setColumn(p.getColumn() - 1);
            } else if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                p.setValues(position.getRow() - 2, position.getColumn() - 2);
                if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
                    mat[p.getRow()][p.getColumn()] = true;
                    p.setRow(p.getRow() - 2);
                    p.setColumn(p.getColumn() - 2);
                }
            }

            //NE
            p.setValues(position.getRow() - 1, position.getColumn() + 1);
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
                p.setRow(p.getRow() - 1);
                p.setColumn(p.getColumn() + 1);
            } else if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                p.setValues(position.getRow() - 2, position.getColumn() + 2);
                if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
                    mat[p.getRow()][p.getColumn()] = true;
                    p.setRow(p.getRow() - 2);
                    p.setColumn(p.getColumn() + 2);

                }
            }
        }

        return mat;
    }
}
