package ua.artcode.week3.day3.my_version.utils;

import ua.artcode.week3.day3.my_version.model.Group;

/**
 * Created by Alexey_O on 12.09.2017.
 */
public class AppDBUtils {

    public static boolean groupValidator(Group group) { // TODO: groupValidator(Group group);
        if (group == null) {
            return false;
        }
        return true;
    }

}
