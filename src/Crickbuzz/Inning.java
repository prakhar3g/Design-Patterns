package Crickbuzz;

import java.util.ArrayList;
import java.util.List;

public class Inning {
    private Team battingTeam;
    private Team bowlingTeam;
    List<Over> overList;

    public Inning(Team battingTeam,Team bowlingTeam) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        overList = new ArrayList<>();
    }

    public void startInning(int runsToWin) {

    }

    public int getTotalRun() {
        return 0;
    }
}
