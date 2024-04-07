package Crickbuzz;

import Crickbuzz.scoreupdater.ScoreUpdater;

import java.util.List;

public class Ball {
    public int ballNumber;
    public BallType ballType;
    public RunType runType;
    public Player playedBy;
    public Player bowledBy;
    public Wicket wicket;
    public List<ScoreUpdater> scoreUpdaters;
}
