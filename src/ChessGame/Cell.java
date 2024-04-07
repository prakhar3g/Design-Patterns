package ChessGame;

import ChessGame.piece.Piece;

public class Cell {
    private int xPosition;
    private int yPosition;
    private Piece piece;

    public Cell(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
