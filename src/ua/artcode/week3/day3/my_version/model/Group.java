package ua.artcode.week3.day3.my_version.model;

import ua.artcode.week3.day3.my_version.utils.GroupUtils;

import java.util.ArrayList;

/**
 * Created by Alexey_O on 10.09.2017.
 */
public class Group {

    // Fields and properties:
    private int id;
    private ArrayList<Card> cardList;

    // Constructors:
    public Group() {
        cardList = new ArrayList<>();
    }

    public Group(int id, ArrayList<Card> cardList) {
        this.id = id;
        this.cardList = cardList;
    }

    // Getters and setters:
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Card> getCardList() {
        return cardList;
    }

    public void setCardList(ArrayList<Card> cardList) {
        this.cardList = cardList;
    }

    // Other methods:
    public boolean addCard(Card card) { // TODO: addCard(Card card);
        if (GroupUtils.cardValidator(card)) {
            return cardList.add(card);
        }

        return false;
    }

    public Card removeCard(int id) {    // TODO: removeCard(int id);
        for (int i = 0; i < cardList.size(); i++) {
            if (cardList.get(i).getId() == id) {
                return cardList.remove(i);
            }
        }

        return null;
    }

}
