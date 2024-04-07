package SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    private int diceCount;
    int minimum=1;
    int maximum=6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {
        int dicePosition=0;
        int i = 0;
        while (i < diceCount) {
            dicePosition += ThreadLocalRandom.current().nextInt(minimum,maximum+1);
            i++;
        }
        return dicePosition;
    }
}
