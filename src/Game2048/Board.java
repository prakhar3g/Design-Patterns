package Game2048;

import java.util.Random;

public class Board {
    private int boardSize;
    private Cell gameBoard[][];
    private static final int WINNING_TILE = 2048;

    Board(int size) {
        this.boardSize = size;
        gameBoard = new Cell[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i=0;i<boardSize;i++) {
            for (int j=0;j<boardSize;j++) {
                Cell cell = new Cell(0);
                gameBoard[i][j] = cell;
             }
        }
        addNewCell();
        addNewCell();
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public Cell[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(Cell[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public void addNewCell() {
        Random random = new Random();
        int value = random.nextInt(10)<5?2:4;
        while (true) {
            int row = random.nextInt(boardSize);
            int col = random.nextInt(boardSize);

            if (gameBoard[row][col].getValue()==0) {
                gameBoard[row][col].setValue(value);
                break;
            }
         }
    }

    public void displayBoard() {
        for (int i=0;i<boardSize;i++) {
            for (int j=0;j<boardSize;j++) {
                System.out.print(gameBoard[i][j].getValue()+" ");
            }
            System.out.println();
        }
    }

    public int moveCell(Direction direction) {
        Cell [][]tempBoard = temporaryBoard();
        int currScore= 0;
        switch (direction) {
            case UP:
                currScore=moveUp();
                break;
            case DOWN:
               currScore=moveDown();
                break;
            case LEFT:
               currScore=moveLeft();
                break;
            case RIGHT:
               currScore=moveRight();
                break;
        }

        if (!isBoardEqual(tempBoard)) {
            addNewCell();
        }
        return currScore;
    }

    private Cell[][] temporaryBoard() {
        Cell [][]tempBoard = new Cell[boardSize][boardSize];
        for (int i=0;i<boardSize;i++) {
            for (int j=0;j<boardSize;j++) {
                tempBoard[i][j] = gameBoard[i][j];
            }
        }
        return tempBoard;
    }

    private int moveUp() {
        int curr_score = 0;
        for (int col=0;col<boardSize;col++) {
            int row_index = 0;
            for (int row=1;row<boardSize;row++) {
                if (gameBoard[row][col].getValue() != 0) {
                    if (gameBoard[row_index][col].getValue() == 0) {
                        gameBoard[row_index][col].setValue(gameBoard[row][col].getValue());
                        gameBoard[row][col].setValue(0);
                    }
                    else if (gameBoard[row_index][col].getValue() == gameBoard[row][col].getValue()) {
                        gameBoard[row_index][col].setValue(gameBoard[row][col].getValue()*2);
                        curr_score += gameBoard[row_index][col].getValue();
                        gameBoard[row][col].setValue(0);
                        row_index++;
                    }
                    else {
                        row_index++;
                        gameBoard[row_index][col].setValue(gameBoard[row][col].getValue());
                        if (row != row_index) {
                            gameBoard[row][col].setValue(0);
                        }
                    }
                }
            }
        }
        return curr_score;
    }

    private int moveDown() {
        int curr_score = 0;
        for (int col=0;col<boardSize;col++) {
            int row_index = boardSize-1;
            for (int row=boardSize-2;row>=0;row--) {
                if (gameBoard[row][col].getValue() != 0){
                    if (gameBoard[row_index][col].getValue() == 0) {
                        gameBoard[row_index][col].setValue(gameBoard[row][col].getValue());
                        gameBoard[row][col].setValue(0);
                    }
                    else if (gameBoard[row_index][col].getValue() == gameBoard[row][col].getValue()) {
                        gameBoard[row_index][col].setValue(gameBoard[row][col].getValue()*2);
                        curr_score += gameBoard[row_index][col].getValue();
                        gameBoard[row][col].setValue(0);
                        row_index--;
                    }
                    else {
                        row_index++;
                        gameBoard[row_index][col].setValue(gameBoard[row][col].getValue());
                        if (row != row_index) {
                            gameBoard[row][col].setValue(0);
                        }
                    }
                }
            }
        }
        return curr_score;
    }

    private int moveLeft() {
        int currScore = 0;
        for (int row=0;row<boardSize;row++) {
            int col_index = 0;
            for (int col=1;col<boardSize;col++) {
                if (gameBoard[row][col].getValue() != 0) {
                    if (gameBoard[row][col_index].getValue() == 0) {
                        gameBoard[row][col_index].setValue(gameBoard[row][col].getValue());
                        gameBoard[row][col].setValue(0);
                    }
                    else if (gameBoard[row][col].getValue() == gameBoard[row][col_index].getValue()) {
                        gameBoard[row][col_index].setValue(gameBoard[row][col].getValue()*2);
                        currScore += gameBoard[row][col_index].getValue();
                        gameBoard[row][col].setValue(0);
                        col_index++;
                    }
                    else {
                        col_index++;
                        gameBoard[row][col_index].setValue(gameBoard[row][col].getValue());
                        if (col!=col_index) {
                            gameBoard[row][col].setValue(0);
                        }
                    }
                }
            }
        }
        return currScore;
    }

    private int moveRight() {
        int curr_score = 0;
        for (int row=0;row<boardSize;row++) {
            int col_index = boardSize-1;
            for (int col=boardSize-2;col>=0;col--) {
                if (gameBoard[row][col].getValue() != 0) {
                    if (gameBoard[row][col_index].getValue() == 0) {
                        gameBoard[row][col_index].setValue(gameBoard[row][col].getValue());
                        gameBoard[row][col].setValue(0);
                    }
                    else if (gameBoard[row][col].getValue() == gameBoard[row][col_index].getValue()) {
                        gameBoard[row][col_index].setValue(gameBoard[row][col].getValue()*2);
                        curr_score += gameBoard[row][col_index].getValue();
                        gameBoard[row][col].setValue(0);
                        col_index--;
                    }
                    else {
                        col_index--;
                        gameBoard[row][col_index].setValue(gameBoard[row][col].getValue());
                        if (col!=col_index) {
                            gameBoard[row][col].setValue(0);
                        }
                    }
                }
            }
        }
        return curr_score;
    }

    private boolean isBoardEqual(Cell[][] temporaryBoard) {
        for (int i=0;i<boardSize;i++) {
            for (int j=0;j<boardSize;j++) {
                if (gameBoard[i][i].getValue() != temporaryBoard[i][j].getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isWinningCellFound() {
        for (int i=0;i<boardSize;i++) {
            for (int j=0;j<boardSize;j++) {
                if (gameBoard[i][i].getValue() == WINNING_TILE) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isGameOver() {
        if (!isBoardFull()) {
            return false;
        }

        for (int i=0;i<boardSize;i++) {
            for (int j=0;j<boardSize-1;j++) {
                if (gameBoard[i][j].getValue() == gameBoard[i][j+1].getValue()) {
                    return false;
                }
            }
        }

        for (int i=0;i<boardSize-1;i++) {
            for (int j=0;j<boardSize;j++) {
                if (gameBoard[i][j].getValue() == gameBoard[i][j].getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isBoardFull() {
        for (int i=0;i<boardSize;i++) {
            for (int j=0;j<boardSize;j++) {
                if (gameBoard[i][0].getValue()==0) {
                    return false;
                }
            }
        }
        return true;
    }
}
