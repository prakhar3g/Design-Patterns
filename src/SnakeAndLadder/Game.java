package SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> players = new LinkedList<>();
    private Player winner;

    public Game(){
        initializeGame();
    }

    private void initializeGame(){
        board = new Board();
        dice = new Dice(1);
        addPlayers();
        winner=null;
    }

    private void addPlayers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Players: ");
        int numberOfPlayers = scanner.nextInt();
        for (int i=1;i<=numberOfPlayers;i++){
            System.out.print("Enter Name of Player "+i+":");
            String name=scanner.next();
            Player player = new Player(name,0);
            players.add(player);
        }
    }

    public void StartGame(){

        while (winner==null){
            Player player = findNextPlayer();
            System.out.println("Current Player: "+player.getPlayerName()+" and Position: "+player.getCurrentPosition());
            int diceNumber = dice.rollDice();
            int playerNewPosition = player.getCurrentPosition()+diceNumber;
            playerNewPosition = jumpCheck(playerNewPosition);
            player.setCurrentPosition(playerNewPosition);
            System.out.println("Player "+player.getPlayerName()+" new position: "+playerNewPosition);

            if (playerNewPosition>=(board.getBoardSize()*board.getBoardSize())){
                winner = player;
            }
        }
        System.out.println("Winner of the game is "+winner.getPlayerName());
    }

    private Player findNextPlayer(){
        Player player = players.pollFirst();
        players.addLast(player);
        return player;
    }

    private int jumpCheck(int position){
        Cell cell = board.getCell(position);
        if (cell.getJump()!=null){
            return cell.getJump().getEndPosition();
        }
        return position;
    }
}
