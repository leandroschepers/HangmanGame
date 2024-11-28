import java.util.Scanner;

public class HangmanApp {
    private HangmanGame game;
    private Player player;
    private Scanner scanner;

    public HangmanApp(Player player, int maxAttempts) {
        this.player = player;
        this.scanner = new Scanner(System.in);
        WordBank wordBank = new WordBank();
        String word = wordBank.getRandomWord();
        this.game = new HangmanGame(word, maxAttempts);
    }

    public void startGame() {
        System.out.println("Bem-vindo ao Jogo da Forca, " + player.getName() + "!");
        while (!game.isGameWon() && !game.isGameLost()) {
            game.displayGameStatus();
            System.out.print("Digite uma letra: ");
            char guess = scanner.next().charAt(0);
            if (game.guessLetter(guess)) {
                System.out.println("Boa! Você acertou.");
            } else {
                System.out.println("Ops! Você errou.");
            }
        }
        endGame();
    }

    private void endGame() {
        if (game.isGameWon()) {
            System.out.println("Parabéns! Você venceu.");
            player.incrementScore(10);
        } else {
            System.out.println("Você perdeu. A palavra era: " + game.getMaskedWord());
        }
        player.addGameToHistory(game.getMaskedWord(), game.isGameWon(), game.getAttemptsLeft());
        player.displayGameHistory();
    }
}