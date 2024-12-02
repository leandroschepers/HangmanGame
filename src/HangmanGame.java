import java.util.ArrayList;
import java.util.List;

public class HangmanGame {
    private String word;
    private String maskedWord;
    private int attemptsLeft;
    private List<Character> guessedLetters;
    private List<GameObserver> observers;

    public HangmanGame(String word, int maxAttempts) {
        this.word = word;
        this.maskedWord = "_".repeat(word.length());
        this.attemptsLeft = maxAttempts;
        this.guessedLetters = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addObserver(GameObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        boolean won = isGameWon();
        for (GameObserver observer : observers) {
            observer.onGameEnd(word, won, attemptsLeft);
        }
    }

    public boolean isGameWon() {
        return !maskedWord.contains("_");
    }

    public boolean isGameLost() {
        return attemptsLeft <= 0;
    }

    public boolean guessLetter(char letter) {
        letter = Character.toLowerCase(letter); // Normaliza para letras minúsculas

        if (guessedLetters.contains(letter)) {
            System.out.println("Você já tentou essa letra.");
            return false;
        }
        guessedLetters.add(letter);

        if (word.toLowerCase().contains(String.valueOf(letter))) {
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

    public String getMaskedWord() {
        return maskedWord;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }
    public String getWord() {
        return word;
    }
}
