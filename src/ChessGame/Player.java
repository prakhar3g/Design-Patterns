package ChessGame;

import ChessGame.enums.Color;

public class Player {
    private String playerName;
    private Color playerColor;

    public Player(String playerName, Color playerColor) {
        this.playerName = playerName;
        this.playerColor = playerColor;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Color getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(Color playerColor) {
        this.playerColor = playerColor;
    }
}
