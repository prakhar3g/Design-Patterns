package Crickbuzz;

import java.util.List;
import java.util.Queue;

public class Team {
    private String teamName;
    private Queue<Player> playingEleven;
    private List<Player> benchedPlayers;
    private BattingController battingController;
    private BowlingController bowlingController;

    public Team(String teamName, Queue<Player> playingEleven, List<Player> bench, List<Player> bowlers){
        this.teamName = teamName;
        this.playingEleven = playingEleven;
        this.benchedPlayers = bench;
        battingController = new BattingController(playingEleven);
        bowlingController = new BowlingController(bowlers);
    }


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Queue<Player> getPlayingEleven() {
        return playingEleven;
    }

    public void setPlayingEleven(Queue<Player> playingEleven) {
        this.playingEleven = playingEleven;
    }

    public List<Player> getBenchedPlayers() {
        return benchedPlayers;
    }

    public void setBenchedPlayers(List<Player> benchedPlayers) {
        this.benchedPlayers = benchedPlayers;
    }

    public void printBattingScoreCard() {
        for (Player player:playingEleven) {
            player.printBattingScoreCard();
        }
    }

}
