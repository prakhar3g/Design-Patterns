package ChessGame;

public class Board {
    private int boardSize;
    private Cell chessBoard[][];

    public Board(int boardSize) {
        this.boardSize = boardSize;
        chessBoard = new Cell[boardSize][boardSize];
        for (int i=0;i<boardSize;i++) {
            for (int j=0;j<boardSize;j++) {
                chessBoard[i][j] = new Cell(i,j);
            }
        }
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public Cell[][] getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(Cell[][] chessBoard) {
        this.chessBoard = chessBoard;
    }
}
