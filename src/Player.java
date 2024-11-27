import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int score;
    private List<GameHistory> gameHistory;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.gameHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore(int points) {
        this.score += points;
    }

    public List<GameHistory> getGameHistory() {
        return gameHistory;
    }


    public void addGameToHistory(String word, boolean won, int attemptsLeft) {
        GameHistory game = new GameHistory(word, won, attemptsLeft);
        gameHistory.add(game);
    }

    public void displayGameHistory() {
        if (gameHistory.isEmpty()) {
            System.out.println("Nenhuma partida jogada");
        } else {
            System.out.println("Histórico de partidas " + name + ":");
            for (GameHistory game : gameHistory) {
                System.out.println(game);
            }
        }
    }
}
