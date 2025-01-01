public class GameData {
    private String winnerName;
    private String loserName;
    private String gameDate;

    // Constructor
    public GameData(String winnerName, String loserName, String gameDate) {
        this.winnerName = winnerName;
        this.loserName = loserName;
        this.gameDate = gameDate;
    }

    // Getters
    public String getWinnerName() {
        return winnerName;
    }

    public String getLoserName() {
        return loserName;
    }

    public String getGameDate() {
        return gameDate;
    }
}
