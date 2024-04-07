package Game2048;

import java.util.Scanner;

public class Game {
    private Player player;
    private Board board;
    private boolean isGameOver=false;
    private int score=0;
    Scanner scanner = new Scanner(System.in);

    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        System.out.print("Enter Player name: ");
        String name = scanner.next();
        System.out.print("Enter Username: ");
        String userName = scanner.next();
        player = new Player(name,userName);
        System.out.print("Enter board Size: ");
        int size = scanner.nextInt();
        board = new Board(size);
    }

    public void startGame() {
        while (!board.isGameOver()) {
            displayBoard();
            System.out.print("Enter move: ");
            String move = scanner.nextLine();
            Direction direction = getDirection(move);
            if (direction == Direction.INVALID) {
                System.out.println("Invalid Move, Try Again");
            }else {
                int curr_score = board.moveCell(direction);
                score += curr_score;
                if (board.isWinningCellFound()) {
                    System.out.print("Congrats you won!!");
                }
            }
        }
    }

    private Direction getDirection(String move) {
        if (Direction.UP.name().equals(move)) {
            return Direction.UP;
        }
        else if (Direction.DOWN.name().equals(move)) {
            return Direction.DOWN;
        }
        else if (Direction.RIGHT.name().equals(move)) {
            return Direction.RIGHT;
        }
        else if (Direction.LEFT.name().equals(move)) {
            return Direction.LEFT;
        }
        else {
            return Direction.INVALID;
        }
    }

    public void displayBoard() {
        System.out.println("Score: "+score);
        board.displayBoard();
    }

}
