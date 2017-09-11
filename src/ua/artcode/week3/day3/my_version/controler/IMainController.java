package ua.artcode.week3.day3.my_version.controler;

import ua.artcode.week3.day3.my_version.model.Card;
import ua.artcode.week3.day3.my_version.model.Group;

import java.util.ArrayList;

/**
 * Created by Alexey_O on 10.09.2017.
 */
public interface IMainController {

    Card removeCard(int groupId, int cardId);
    boolean addCard(int groupId, Card card);
    boolean createGroup(Group group);
    ArrayList<Card> getCardsOfGroup(int groupId);

}
