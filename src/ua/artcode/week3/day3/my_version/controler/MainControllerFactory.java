package ua.artcode.week3.day3.my_version.controler;

import ua.artcode.week3.day3.my_version.data_container.AppDB;
import ua.artcode.week3.day3.my_version.model.Group;

import java.util.ArrayList;

/**
 * Created by Alexey_O on 12.09.2017.
 */
public class MainControllerFactory {

    public static MainController create() {
        return new MainController(new AppDB());
    }

    public static MainController create(AppDB appDB) {
        if (appDB == null) {
            return create();
        }
        return new MainController(appDB);
    }

    public static MainController create(ArrayList<Group> groupList) {
        if (groupList == null) {
            return create();
        }
        return new MainController(new AppDB(groupList));
    }

}
