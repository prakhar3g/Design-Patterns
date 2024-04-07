package Crickbuzz;

public class BattingScoreCard {
    private int totalRuns;
    private int totalBallsPlayed;
    private int totalFours;
    private int totalSix;
    private double strikeRate;
    private Wicket wicket;


    @Override
    public String toString() {
        return "BattingScoreCard{" +
                "totalRuns=" + totalRuns +
                ", totalBallsPlayed=" + totalBallsPlayed +
                ", totalFours=" + totalFours +
                ", totalSix=" + totalSix +
                ", strikeRate=" + strikeRate +
                ", wicket=" + wicket +
                '}';
    }
}
