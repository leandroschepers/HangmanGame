import java.util.ArrayList;
import java.util.List;

public class HangmanGame {
    private String word;               // Palavra a ser adivinhada
    private String maskedWord;         // Palavra mascarada com os espaços
    private int attemptsLeft;          // Tentativas restantes
    private List<Character> guessedLetters;  // Letras já adivinhadas

    public HangmanGame(String word, int maxAttempts) {
        this.word = word;
        this.maskedWord = "_".repeat(word.length());
        this.attemptsLeft = maxAttempts;
        this.guessedLetters = new ArrayList<>();
    }
    public boolean isGameWon() {
        return !maskedWord.contains("_");
    }

    public boolean isGameLost() {
        return attemptsLeft <= 0;
    }

    public boolean guessLetter(char letter) {
        if (guessedLetters.contains(letter)) {
            System.out.println("Você já tentou essa letra.");
            return false;
        }
        guessedLetters.add(letter);
        if (word.contains(String.valueOf(letter))) {
            updateMaskedWord(letter);
            return true;
        } else {
            attemptsLeft--;
            return false;
        }
    }

    private void updateMaskedWord(char letter) {
        StringBuilder updatedMaskedWord = new StringBuilder(maskedWord);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                updatedMaskedWord.setCharAt(i, letter);
            }
        }
        maskedWord = updatedMaskedWord.toString();
    }

    public void displayGameStatus() {
        System.out.println("Palavra: " + maskedWord);
        System.out.println("Tentativas restantes: " + attemptsLeft);
    }

    public String getMaskedWord() {
        return maskedWord;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

}
