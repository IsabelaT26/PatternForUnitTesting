package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	public static enum Rank {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	public static enum Suit {

		CLUB('♣'), DIAMOND('♦'), HEART('♥'), SPADE('♠');

		public final char symbol;

		private Suit(char symbol) {
			this.symbol = symbol;
		}

	}

	public static class Card {
		private final Rank rank;
		private final Suit suit;

		public Card(Rank rank, Suit suit) {
			this.rank = rank;
			this.suit = suit;
		}

		public Rank getRank() {
			return rank;
		}

		public Suit getSuit() {
			return suit;
		}

		@Override
		public String toString() {
			return String.format("%s OF %sS", rank, suit);
		}
	}

	private static final Random RND = new Random();

	private List<Card> cards = new ArrayList<>();

	public Deck() {
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				cards.add(new Card(rank, suit));
			}
		}
	}

	public int cardsLeft() {
		return cards.size();
	}

	/**
	 * Removes and returns a random card from the deck.
	 * 
	 * @return a random card
	 * @throws IllegalStateException if the deck is empty 
	 */
	public Card draw() {
		if (cards.isEmpty())
			throw new IllegalStateException();
		return cards.remove(RND.nextInt(cardsLeft()));
	}
}
