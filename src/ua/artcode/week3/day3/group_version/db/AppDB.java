package ua.artcode.week3.day3.group_version.db;

import ua.artcode.week3.day3.group_version.model.CardGroup;

import java.util.ArrayList;

/**
 * Created by Alexey_O on 10.09.2017.
 */

// DAO
public class AppDB implements GroupDAO{

    private int count;

    private ArrayList<CardGroup> cardGroups;

    public AppDB() {
        cardGroups = new ArrayList<>();
    }

    public AppDB(ArrayList<CardGroup> cardGroups) {
        this.cardGroups = cardGroups;
    }

    public ArrayList<CardGroup> getCardGroups() {
        return cardGroups;
    }

    public void setCardGroups(ArrayList<CardGroup> cardGroups) {
        this.cardGroups = cardGroups;
    }

    @Override
    public CardGroup create(CardGroup cardGroup) {
        cardGroup.setId(generateId());
        // TODO: create(CardGroup cardGroup);
        return null;
    }

    private int generateId() {
        return count++;
    }

    @Override
    public CardGroup findOne(int id) {

        for (CardGroup element: cardGroups) {
            if (element.getId() == id) {
                return element;
            }
        }

        return null;
    }

    @Override
    public CardGroup update(CardGroup newCardGroup, int id) {

        for (CardGroup element: cardGroups) {
            if (element.getId() == id) {
                return cardGroups.set(id, newCardGroup);
            }
        }

        return null;
    }

    @Override
    public CardGroup delete(int id) {

        for (CardGroup element: cardGroups) {
            if (element.getId() == id) {
                return cardGroups.remove(id);
            }
        }

        return null;
    }


}
