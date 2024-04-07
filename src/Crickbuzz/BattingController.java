package Crickbuzz;

import java.util.LinkedList;
import java.util.Queue;

public class BattingController {

    private Queue<Player> yetToPlay;
    private Player striker;
    private Player nonStriker;

    public BattingController(Queue<Player> playingEleven) {
        this.yetToPlay = new LinkedList<>();
        this.yetToPlay.addAll(playingEleven);
    }
}
