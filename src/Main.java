import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);

        System.out.print("Digite o número máximo de tentativas: ");
        int maxAttempts = scanner.nextInt();
        scanner.nextLine();

        HangmanApp app = new HangmanApp(player, maxAttempts);

        app.startGame();

        while (true) {
            System.out.print("Deseja jogar novamente? (s/n): ");
            String response = scanner.nextLine().trim().toLowerCase();

            if (response.equals("s")) {
                app = new HangmanApp(player, maxAttempts);
                app.startGame();
            } else if (response.equals("n")) {
                System.out.println("Obrigado por jogar! Até a próxima!");
                break;
            } else {
                System.out.println("Resposta inválida. Digite 's' para sim ou 'n' para não.");
            }
        }

        scanner.close();
    }
}
