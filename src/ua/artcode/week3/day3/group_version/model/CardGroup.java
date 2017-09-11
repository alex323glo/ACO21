package ua.artcode.week3.day3.group_version.model;

import java.util.ArrayList;

/**
 * Created by Alexey_O on 10.09.2017.
 */
public class CardGroup {

    private int id;
    private ArrayList<Card> cards;

    public CardGroup() {
    }

    public CardGroup(int id, ArrayList<Card> cards) {
        this.id = id;
        this.cards = cards;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
