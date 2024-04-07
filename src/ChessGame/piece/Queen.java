package ChessGame.piece;

import ChessGame.Board;
import ChessGame.Cell;
import ChessGame.enums.Color;

public class Queen extends Piece{

    public Queen(Color color, boolean isKilled) {
        super(color, isKilled);
    }

    @Override
    public boolean isValidMove(Board board, Cell startPosition, Cell endPosition) {
        return false;
    }
}
