package checkers;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class CheckersPiece extends Piece {
    private Color color;

    // Passa pra classe Piece o board e recebe a cor das peças
    public CheckersPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    //Retorna a cor das peças
    public Color getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece(Position position) {
        CheckersPiece p = (CheckersPiece)getBoard().piece(position);

        return p != null && p.getColor() != color;

    }

}
