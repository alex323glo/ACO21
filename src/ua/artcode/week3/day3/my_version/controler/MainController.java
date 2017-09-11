package ua.artcode.week3.day3.my_version.controler;

import ua.artcode.week3.day3.my_version.data_container.AppDB;
import ua.artcode.week3.day3.my_version.model.Card;
import ua.artcode.week3.day3.my_version.model.Group;

import java.util.ArrayList;

/**
 * Created by Alexey_O on 10.09.2017.
 */
public class MainController implements IMainController {

    // Fields and properties:
    private AppDB appDB;

    // Constructors:
    public MainController(AppDB appDB) {
        this.appDB = appDB;
    }

    // Getters and setters:
    public AppDB getAppDB() {
        return appDB;
    }

    public void setAppDB(AppDB appDB) {
        this.appDB = appDB;
    }

    // Implemented methods:
    @Override
    public boolean addCard(int groupId, Card card) {        // TODO: addCard(int groupId, Card card);
        //if (appDB == null || appDB.)
        return false;
    }

    @Override
    public Card removeCard(int groupId, int cardId) {       // TODO: removeCard(int groupId, int cardId);
        return null;
    }

    @Override
    public boolean createGroup(Group group) {               // TODO: createGroup(Group group);
        return false;
    }

    @Override
    public ArrayList<Card> getCardsOfGroup(int groupId) {   // TODO: getCardsOfGroup(int groupId);
        return null;
    }

}
