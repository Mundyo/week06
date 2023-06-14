package week06;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	 private List<Card> cards;

	    public Deck() {
	        cards = new ArrayList<>();
	        populateDeck();
	    }

	    private void populateDeck() {
	        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	        String[] names = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

	        for (String suit : suits) {
	            for (int i = 0; i < names.length; i++) {
	                String name = names[i] + " of " + suit;
	                int value = i + 1;
	                Card card = new Card(value, name);
	                cards.add(card);
	            }
	        }
	    }

	    public void shuffle() {
	        Random rand = new Random();
	        for (int i = 0; i < cards.size(); i++) {
	            int j = rand.nextInt(cards.size());
	            Card temp = cards.get(i);
	            cards.set(i, cards.get(j));
	            cards.set(j, temp);
	        }
	    }

	    public Card draw() {
	        if (!cards.isEmpty()) {
	            return cards.remove(0);
	        }
	        return null;
	    }
	}

