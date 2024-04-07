package TicTacToe;

public class Board {
    private int boardSize;
    private Piece pieces[][];

    public Board(int boardSize) {
        this.boardSize = boardSize;
        pieces = new Piece[boardSize][boardSize];
    }

    public boolean addPiece(int row, int col, Piece piece) {
        if (pieces[row][col] != null) {
            return false;
        }
        pieces[row][col] = piece;
        return true;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }

    public void printBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (pieces[i][j] != null) {
                    System.out.print(pieces[i][j].getPieceType().name() + "   ");
                } else {
                    System.out.print("    ");
                }
                if (j!=boardSize-1)
                    System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFilled() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (pieces[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

}
