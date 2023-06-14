package week06;

public class Card {

	
	    private int value;
	    private String name;

	    public Card(int value, String name) {
	        this.value = value;
	        this.name = name;
	    }

	    public int getValue() {
	        return 0;
	    }

	    public String getName() {
	        return name;
	    }

	    public void describe() {
	        System.out.println(name + " (" + value + ")");
	    }
	}

