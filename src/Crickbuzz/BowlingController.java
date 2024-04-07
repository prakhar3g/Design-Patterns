package Crickbuzz;

import java.util.*;

public class BowlingController {
    private Deque<Player> bowlers;
    private Player currentBowler;
    private Map<Player,Integer> bowlerVsOver;

    public BowlingController(List<Player> bowlers) {
        setBowlersList(bowlers);
    }

    private void setBowlersList(List<Player> bowlersList) {
        this.bowlers = new LinkedList<>();
        bowlerVsOver = new HashMap<>();
        for (Player bowler : bowlersList) {
            this.bowlers.addLast(bowler);
            bowlerVsOver.put(bowler, 0);
        }
    }

}
