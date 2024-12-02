public class GameFactory {
    public static HangmanGame createGame(String word, int maxAttempts) {
        return new HangmanGame(word, maxAttempts);
    }
}
