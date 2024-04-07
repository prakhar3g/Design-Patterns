package ChessGame;

import ChessGame.enums.Color;
import ChessGame.enums.GameStatus;
import ChessGame.piece.*;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Game {
    private Board board;
    private Deque<Player> players;
    private List<Move> movePlayed;
    private GameStatus gameStatus;

    public Game() {
        initialiseChessGame();
        displayBoard();
    }

    private void initialiseChessGame() {
        board = new Board(8);
        for (int i = 0; i < board.getBoardSize(); i++) {
            for (int j = 0; j < board.getBoardSize(); j++) {
                Cell cell = board.getChessBoard()[i][j];
                if (i == 0) {
                    if (j == 0 || j == 7) {
                        cell.setPiece(new Rook(Color.WHITE, false));
                    } else if (j == 1 || j == 6) {
                        cell.setPiece(new Knight(Color.WHITE, false));
                    } else if (j == 2 || j == 5) {
                        cell.setPiece(new Bishop(Color.WHITE, false));
                    } else if (j == 3) {
                        cell.setPiece(new Queen(Color.WHITE, false));
                    } else if (j == 4) {
                        cell.setPiece(new King(Color.WHITE, false));
                    }
                }

                if (i == 1) {
                    cell.setPiece(new Pawn(Color.WHITE, false));
                }

                if (i == 6) {
                    cell.setPiece(new Pawn(Color.BLACK, false));
                }

                if (i == 7) {
                    if (j == 0 || j == 7) {
                        cell.setPiece(new Rook(Color.BLACK, false));
                    } else if (j == 1 || j == 6) {
                        cell.setPiece(new Knight(Color.BLACK, false));
                    } else if (j == 2 || j == 5) {
                        cell.setPiece(new Bishop(Color.BLACK, false));
                    } else if (j == 3) {
                        cell.setPiece(new Queen(Color.BLACK, false));
                    } else if (j == 4) {
                        cell.setPiece(new King(Color.BLACK, false));
                    }
                }
            }
        }

        Player player1 = new Player("Prakhar",Color.WHITE);
        Player player2 = new Player("Ashu",Color.BLACK);

        players = new LinkedList<>();
        players.add(player1);
        players.add(player2);

        movePlayed = new ArrayList<>();
    }

    private void displayBoard() {
        for (int i=0;i< board.getBoardSize();i++) {
            for (int j=0;j<board.getBoardSize();j++) {
                Cell currentCell = board.getChessBoard()[i][j];
                if (currentCell.getPiece() instanceof Rook) {
                    System.out.print(getColor(currentCell.getPiece().getColor())+"R"+" ");
                }
                if (currentCell.getPiece() instanceof Knight) {
                    System.out.print(getColor(currentCell.getPiece().getColor())+"K"+" ");
                }
                if (currentCell.getPiece() instanceof Bishop) {
                    System.out.print(getColor(currentCell.getPiece().getColor())+"B"+" ");
                }
                if (currentCell.getPiece() instanceof Queen) {
                    System.out.print(getColor(currentCell.getPiece().getColor())+"Q"+" ");
                }
                if (currentCell.getPiece() instanceof King) {
                    System.out.print(getColor(currentCell.getPiece().getColor())+"K"+" ");
                }
                if (currentCell.getPiece() instanceof Pawn) {
                    System.out.print(getColor(currentCell.getPiece().getColor())+"P"+" ");
                }
            }
            System.out.println();
        }
    }

    private String getColor(Color color) {
        return color.name().equals(Color.WHITE.name())?"W":"B";
    }

    public void startPlayingGame() {
        Player currentPlayer = players.getFirst();
        System.out.print("Current Player: "+currentPlayer+" ,Enter Position to be played: ");
    }

}
