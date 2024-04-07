package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {

    private Board board;
    private Deque<Player> players;

    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        Piece pieceX = new Piece(PieceType.X);
        Piece pieceO = new Piece(PieceType.O);

        Player player1 = new Player("Ashu", pieceX);
        Player player2 = new Player("Prakhar", pieceO);

        players = new LinkedList<>();
        players.add(player1);
        players.add(player2);

        board = new Board(3);

    }

    public String startGame() {
        boolean noWinner = true;
        Scanner scanner = new Scanner(System.in);
        while (noWinner) {
            Player currentPlayer = players.pollFirst();

            board.printBoard();
            boolean isBoardFull = board.isBoardFilled();
            if (isBoardFull) {
                noWinner = false;
                continue;
            }
            System.out.print("Player:" + currentPlayer.getPlayerName() + " Enter row,column: ");
            String str = scanner.nextLine();
            String[] userValues= str.split(",");
            int row = Integer.valueOf(userValues[0])-1;
            int col = Integer.valueOf(userValues[1])-1;

            boolean isPieceAdded = board.addPiece(row,col,currentPlayer.getPiece());
            if (!isPieceAdded) {
                System.out.println("Invalid Input, try Again");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);
            boolean isWinner = isThereWinner(row,col,currentPlayer.getPiece().getPieceType());

            if (isWinner){
                board.printBoard();
                return currentPlayer.getPlayerName();
            }

        }

        return "Tie";
    }

    private boolean isThereWinner(int row, int col, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for (int i=0;i< board.getBoardSize();i++){
            if (board.getPieces()[row][i] == null || board.getPieces()[row][i].getPieceType() != pieceType){
                rowMatch = false;
                break;
            }
        }

        for (int i=0;i< board.getBoardSize();i++){
            if (board.getPieces()[i][col] == null || board.getPieces()[i][col].getPieceType() != pieceType){
                columnMatch = false;
                break;
            }
        }

        for (int i=0;i< board.getBoardSize();i++){
            if (board.getPieces()[i][i] == null || board.getPieces()[i][i].getPieceType() != pieceType){
                diagonalMatch = false;
                break;
            }
        }

        for (int i=0,j=board.getBoardSize()-1;i< board.getBoardSize();i++,j--){
            if (board.getPieces()[i][j] == null || board.getPieces()[i][j].getPieceType() != pieceType){
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
