package ua.artcode.week3.day3.group_version.controller;

import ua.artcode.week3.day3.group_version.model.Card;
import ua.artcode.week3.day3.group_version.model.CardGroup;

/**
 * Created by Alexey_O on 10.09.2017.
 */



public interface IMainController {

    boolean createGroup(CardGroup group);
    boolean addCard(Card card, int groupId);
    Card removeCard(int cardId);
    Card removeCard(int groupId, int cardId);
    CardGroup[] getAllGroups();
    Card[] getCards(int groupId);

}
