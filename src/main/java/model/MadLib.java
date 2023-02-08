/**
 * @author Adell - amrogers5
 * CIS175 - Spring 2023
 * Feb 6, 2023
 */
package model;

public class MadLib {
	private String name;
	private String occupation;
	private String verb;
	private String creature;
	private String adjective;
	private String number;
	private String game;
	
	//Constructors
	public MadLib() {
		super();
	}

	public MadLib(String name, String occupation, String verb, String creature, String adjective, String number,
			String game) {
		super();
		this.name = name;
		this.occupation = occupation;
		this.verb = verb;
		this.creature = creature;
		this.adjective = adjective;
		this.number = number;
		this.game = game;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public String getCreature() {
		return creature;
	}

	public void setCreature(String creature) {
		this.creature = creature;
	}

	public String getAdjective() {
		return adjective;
	}

	public void setAdjective(String adjective) {
		this.adjective = adjective;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}
	
	//Methods
	public String createMadLib() {
		return "An adventurer named " + name + " was chosen by a powerful " + occupation + " to " + verb + " a " + creature + "."
				+ "\n The " + creature + " was very " + adjective + "." +
				"\n After travelling for " + number + " days, " + name + " found the " + creature + "and challenged it to a game of " + game
				+". \nIt was a close match, but " + name + " was victorious. \nHowever, " + name + " forgot to " + verb + " the " +
				creature + ", so the " + occupation + " didn't hand over a reward";
	}
}
