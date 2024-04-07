package ChessGame.piece;

import ChessGame.Board;
import ChessGame.Cell;
import ChessGame.enums.Color;

public class King extends Piece{

    public King(Color color, boolean isKilled) {
        super(color, isKilled);
    }

    @Override
    public boolean isValidMove(Board board, Cell startPosition, Cell endPosition) {
        if (endPosition.getPiece().getColor().equals(startPosition.getPiece().getColor())) {
            return false;
        }
        return true;
    }
}
