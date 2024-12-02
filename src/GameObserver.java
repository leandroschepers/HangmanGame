public interface GameObserver {
    void onGameEnd(String word, boolean won, int attemptsLeft);
}
