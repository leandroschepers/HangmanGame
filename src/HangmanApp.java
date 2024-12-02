public class HangmanApp {
    private HangmanGame game;
    private Player player;
    private GameUI gameUI;

    public HangmanApp(Player player, int maxAttempts) {
        this.player = player;
        this.gameUI = new GameUI();

        WordBank wordBank = new WordBank();
        String word = wordBank.getRandomWord();
        this.game = GameFactory.createGame(word, maxAttempts);
        this.game.addObserver(player);
    }

    public void startGame() {
        gameUI.displayMessage("Bem-vindo ao Jogo da Forca, " + player.getName() + "!");

        while (!game.isGameWon() && !game.isGameLost()) {
            gameUI.displayStatus(game.getMaskedWord(), game.getAttemptsLeft());
            char guess = gameUI.getGuess();

            if (game.guessLetter(guess)) {
                gameUI.displayMessage("Boa! Você acertou.");
            } else {
                gameUI.displayMessage("Ops! Você errou.");
            }
        }

        endGame();
    }

    private void endGame() {
        if (game.isGameWon()) {
            System.out.println("Parabéns! Você venceu.");
            player.incrementScore(10);
        } else {
            System.out.println("Você perdeu. A palavra era: " + game.getWord());
        }

        player.addGameToHistory(game.getWord(), game.isGameWon(), game.getAttemptsLeft());
        player.displayGameHistory();
    }
}
