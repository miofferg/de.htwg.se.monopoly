package de.htwg.monopoly.entities;


public interface ICardStack {
	
	/**
	 * Return the first Card off a cardstack and put it back under the
	 * stack. Not yet implemented: "Du kommst aus dem Gef�ngnis frei"-Karte 
	 * 
	 * @return Card
	 */
	ICards getNextCard();

	/**
	 * shuffles this Cardstack.
	 * 
	 */
	void shuffle();

}
