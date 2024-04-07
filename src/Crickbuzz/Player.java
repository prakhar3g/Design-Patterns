package Crickbuzz;

public class Player {
    private Person person;
    private PlayerType playerType;
    private BattingScoreCard battingScoreCard;
    private BowlingScoreCard bowlingScoreCard;

    public Player(Person person, PlayerType playerType) {
        this.person = person;
        this.playerType = playerType;
        battingScoreCard = new BattingScoreCard();
        bowlingScoreCard = new BowlingScoreCard();
    }

    public void printBattingScoreCard() {
        System.out.print(battingScoreCard.toString());
    }

    public void printBowlingScoreCard() {
        System.out.print(bowlingScoreCard.toString());
    }


}
