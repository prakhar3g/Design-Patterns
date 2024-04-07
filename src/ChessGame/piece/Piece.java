package ChessGame.piece;

import ChessGame.Board;
import ChessGame.Cell;
import ChessGame.enums.Color;

public abstract class Piece {
    protected Color color;
    protected boolean isKilled;

    public Piece(Color color, boolean isKilled) {
        this.color = color;
        this.isKilled = isKilled;
    }

    public abstract boolean isValidMove(Board board, Cell startPosition, Cell endPosition);

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }
}
