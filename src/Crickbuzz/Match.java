package Crickbuzz;

import java.util.Date;

public class Match {
    private Team teamA;
    private Team teamB;
    private String venue;
    private Date matchDate;
    private Inning []innings;
    private MatchType matchType;
    private Team tossWinner;

    public Match(Team teamA, Team teamB, String venue, Date matchDate, MatchType matchType) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.venue = venue;
        this.matchDate = matchDate;
        this.matchType = matchType;
        innings = new Inning[2];
    }

    public void startMatch() {

        tossWinner = toss(teamA,teamB);

        Team battingTeam;
        Team bowlingTeam;

        for (int i=1;i<=2;i++) {
            if (i==1) {
                battingTeam = tossWinner;
                bowlingTeam = tossWinner.getTeamName().equals(teamA.getTeamName())?teamB:teamA;
                Inning inning = new Inning(battingTeam,bowlingTeam);
                inning.startInning(-1);
                innings[i-1] = inning;
            }
            else {
                bowlingTeam = tossWinner;
                battingTeam = tossWinner.getTeamName().equals(teamA.getTeamName())?teamB:teamA;
                Inning inning = new Inning(battingTeam,bowlingTeam);
                inning.startInning(innings[0].getTotalRun());
                innings[i-1] = inning;
            }
        }

    }

    private Team toss(Team teamA,Team teamB) {
        double num = Math.random();
        if (num<0.5) {
            return teamA;
        }
        else {
            return teamB;
        }
    }
}
