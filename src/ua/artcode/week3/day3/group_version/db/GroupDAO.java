package ua.artcode.week3.day3.group_version.db;

import ua.artcode.week3.day3.group_version.model.CardGroup;

/**
 * Created by Alexey_O on 10.09.2017.
 */

// CRUD - Create, Read, Update, Delete
public interface GroupDAO {

    CardGroup create(CardGroup cardGroup);
    CardGroup findOne(int id);
    CardGroup update(CardGroup newCardGroup, int id);
    public CardGroup delete(int id);

}
