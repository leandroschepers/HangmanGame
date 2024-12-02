import java.util.Scanner;

public class GameUI {
    private Scanner scanner;

    public GameUI() {
        this.scanner = new Scanner(System.in);
    }

    public char getGuess() {
        System.out.print("Digite uma letra: ");
        return scanner.next().charAt(0);
    }

    public void displayStatus(String maskedWord, int attemptsLeft) {
        System.out.println("Palavra: " + maskedWord);
        System.out.println("Tentativas restantes: " + attemptsLeft);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
