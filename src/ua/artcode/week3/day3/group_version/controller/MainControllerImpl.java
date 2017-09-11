package ua.artcode.week3.day3.group_version.controller;

import ua.artcode.week3.day3.group_version.db.AppDB;
import ua.artcode.week3.day3.group_version.model.Card;
import ua.artcode.week3.day3.group_version.model.CardGroup;

/**
 * Created by Alexey_O on 10.09.2017.
 */
public class MainControllerImpl implements IMainController {

    private AppDB appDB;

    public MainControllerImpl(AppDB appDB) {
        this.appDB = appDB;
    }

    @Override
    public boolean createGroup(CardGroup group) {
        return appDB.create(group) != null;
    }

    @Override
    public boolean addCard(Card card, int groupId) {
        CardGroup one = appDB.findOne(groupId);

        if (one == null) {
            System.out.println("Group was not found!");
            return false;
        }

        return one.getCards().add(card);
    }

    @Override
    public Card removeCard(int cardId) {
        appDB.getCardGroups();
        // TODO: removeCard(int cardId);
        return null;
    }

    @Override
    public Card removeCard(int groupId, int cardId) {
        return null;
    }

    @Override
    public CardGroup[] getAllGroups() {
        return new CardGroup[0];
    }

    @Override
    public Card[] getCards(int groupId) {
        return new Card[0];
    }
}
