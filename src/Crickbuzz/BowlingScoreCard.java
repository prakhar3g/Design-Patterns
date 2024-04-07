package Crickbuzz;

public class BowlingScoreCard {
    private int totalOversCount;
    private int runsGiven;
    private int wicketsTaken;
    private int noBallCount;
    private int wideBallCount;
    private double economyRate;


    @Override
    public String toString() {
        return "BowlingScoreCard{" +
                "totalOversCount=" + totalOversCount +
                ", runsGiven=" + runsGiven +
                ", wicketsTaken=" + wicketsTaken +
                ", noBallCount=" + noBallCount +
                ", wideBallCount=" + wideBallCount +
                ", economyRate=" + economyRate +
                '}';
    }
}
