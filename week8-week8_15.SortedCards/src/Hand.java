/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    
    private List<Card> cards = new ArrayList<Card>();
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public int sumOfHand() {
        int c = 0;
        for (Card card : cards) {
            c += card.getValue();
        }
        return c;
    }
    
    public int compareTo(Hand hand) {
        return this.sumOfHand() - hand.sumOfHand();    
    }
    
    public void sortAgainstSuit() {
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(cards, suitSorter); 
    }
    
}
