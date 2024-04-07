package SnakeAndLadder;

import java.util.Scanner;

public class Board {
    private int boardSize;
    private Cell[][] cells;

    public Board() {
        initializeBoard();
    }

    private void initializeBoard(){
        System.out.print("-----Enter Size of Board-----: ");
        Scanner scanner = new Scanner(System.in);
        boardSize = scanner.nextInt();
        cells = new Cell[boardSize+1][boardSize+1];
        for (int i=0;i<=boardSize;i++){
            for(int j=0;j<=boardSize;j++){
                Cell cell = new Cell();
                cells[i][j]=cell;
            }
        }
        System.out.print("-----Enter Number of Snakes-----: ");
        int numberOfSnakes = scanner.nextInt();
        for (int i=1;i<=numberOfSnakes;i++){
            System.out.print("Enter Starting Position of Snake "+i+": ");
            int startPos = scanner.nextInt();
            System.out.print("Enter Ending Position of Snake "+i+": ");
            int endPos = scanner.nextInt();
            Jump jump = new Jump(startPos,endPos);
            Cell cell = getCell(startPos);
            cell.setJump(jump);
        }
        System.out.print("-----Enter Number of Ladders-----: ");
        int numberOfLadders = scanner.nextInt();
        for (int i=1;i<=numberOfLadders;i++){
            System.out.print("Enter Starting Position of Ladder "+i+": ");
            int startPos = scanner.nextInt();
            System.out.print("Enter Ending Position of Ladder "+i+": ");
            int endPos = scanner.nextInt();
            Jump jump = new Jump(startPos,endPos);
            Cell cell = getCell(startPos);
            cell.setJump(jump);
        }
    }

    public Cell getCell(int position){
        return cells[position/boardSize][position%boardSize];
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }
}
