public class GameHistory {
    private String word;
    private boolean won;
    private int attemptsLeft;

    public GameHistory(String word, boolean won, int attemptsLeft) {
        this.word = word;
        this.won = won;
        this.attemptsLeft = attemptsLeft;
    }

    @Override
    public String toString() {
        return "Palavra: " + word + ", Ganhou: " + (won ? "Sim" : "Não") + ", Tentativas restantes: " + attemptsLeft;
    }
}
