package week06;

public class App {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        for (int i = 0; i < 52; i++) {
            player2.draw(deck);
        }

        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();

            System.out.println(player1.getName() + " flipped:");
            player1Card.describe();
            System.out.println(player2.getName() + " flipped:");
            player2Card.describe();

            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins the round!");
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins the round!");
            } else {
                System.out.println("It's a draw!");
            }

            System.out.println("Score: " + player1.getName() + ": " + player1.getScore() + ", " +
                    player2.getName() + ": " + player2.getScore());
            System.out.println();
        }

        System.out.println("Final Score: " + player1.getName() + ": " + player1.getScore() + ", " +
                player2.getName() + ": " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
