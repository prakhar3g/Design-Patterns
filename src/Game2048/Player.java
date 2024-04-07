package Game2048;

public class Player {
    private String playerName;
    private String playerUserName;

    public Player(String playerName, String playerUserName) {
        this.playerName = playerName;
        this.playerUserName = playerUserName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerUserName() {
        return playerUserName;
    }

    public void setPlayerUserName(String playerUserName) {
        this.playerUserName = playerUserName;
    }
}
