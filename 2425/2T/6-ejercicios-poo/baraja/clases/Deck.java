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
        if(cards.isEmpty()){
            return null;
        }
        return cards.removeFirst();
    }

    public void cut() {
        // 1. Calcular el margen de error
        int error = (int) (Math.random()*11) - 5;
        int cutNumber = cards.size() / 2 + error;
        // 2. Dividir la baraja en 2 partes
        List<Card> up = cards.subList(0, cutNumber);
        List<Card> down = cards.subList(cutNumber, cards.size());
        // 3. Unir las dos partes invertidas
        ArrayList<Card> cuttedCards = new ArrayList<Card>(down);
        cuttedCards.addAll(up);
        this.cards = cuttedCards;
    }

    public void americanShuffle() {
        int cutNumber = (int) Math.ceil(cards.size() / 2.0);
        // TODO Cortar por la mitad e intercalar
        ArrayList<Card> shuffled = new ArrayList<Card>(cards.size());
        for (int i = 0; i < cutNumber; i+=1) {
            shuffled.add(i*2, cards.get(i));
        }
        for (int i = cutNumber; i < cards.size(); i+=1) {
            shuffled.add(i*2+1, cards.get(i));
        }
        this.cards = shuffled;
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
