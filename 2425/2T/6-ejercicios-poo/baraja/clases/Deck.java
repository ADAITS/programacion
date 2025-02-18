package clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        int maxValue = 12;
        String[] suits = { "oro", "copa", "espada", "basto"};
        for (String suit : suits) {
            for (int i = 1; i <= maxValue; i++) {
                this.cards.add(new Card(suit, i));
            }
        }
    }

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Deck(Card ...cards) { // Card[]
        this.cards = new ArrayList<Card>();
        for (Card card : cards) {
            this.cards.add(card);
        }
    }

    public int getNumberOfCards(){
        return cards.size();
    }

    public void sort() {
        // TODO ordena el array de cartas
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        // TODO eliminar primera carta de la lista y devolverla
        return null;
    }

    public void cut() {
        // TODO
    }

    public void americanShuffle() {
        // TODO
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
