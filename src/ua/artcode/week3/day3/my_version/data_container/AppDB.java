package ua.artcode.week3.day3.my_version.data_container;

import ua.artcode.week3.day3.my_version.model.Group;
import ua.artcode.week3.day3.my_version.utils.AppDBUtils;

import java.util.ArrayList;

/**
 * Created by Alexey_O on 10.09.2017.
 */
public class AppDB {

    // Fields and properties:
    private ArrayList<Group> groupList;

    // Constructors:
    public AppDB() {
        groupList = new ArrayList<>();
    }

    public AppDB(ArrayList<Group> groupList) {
        this.groupList = groupList;
    }

    // Getters and setters;
    public ArrayList<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(ArrayList<Group> groupList) {
        this.groupList = groupList;
    }

    // Other methods:
    public boolean addGroup(Group group) {  //TODO: addGroup(Group group);
        if (AppDBUtils.groupValidator(group)) {
            return groupList.add(group);
        }

        return false;
    }

    public Group removeGroup(int id) {     //TODO: removeGroup(int id);
        for (int i = 0; i < groupList.size(); i++) {
            if (groupList.get(i).getId() == id) {
                return groupList.remove(i);
            }
        }

        return null;
    }

}
