/**
 * @author Adell - amrogers5
 * CIS175 - Spring 2023
 * Feb 6, 2023
 */
package model;

public class PotQuot {
	//Attributes
	private String potionPick;
	private String quote;
	
	//Constructors
	public PotQuot() {
		super();
	}

	public PotQuot(String potionPick) {
		super();
		this.potionPick = potionPick;
	}

	//Getters and Setters
	public String getPotionPick() {
		return potionPick;
	}

	public void setPotionPick(String potionPick) {
		this.potionPick = potionPick;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}
	
	//Method
	public String determineQuote() {
		if(potionPick.equals("GREEN")) {
			quote = "I refuse to join any club that would have me as a member. ~Groucho Marx";
			} else if(potionPick.equals("MAUVE")) {
				quote = "Between two evils, I always pick the one I never tried before. ~Mae West";
			} else if (potionPick.equals("ORANGE")) {
				quote = "I can resist everything except temptation. ~Oscar Wilde";
			} else {
				quote = "As a child my family's menu consisted of two choices: take it or leave it.  ~Buddy Hackett";
			}
		return quote;
	}
	
}
