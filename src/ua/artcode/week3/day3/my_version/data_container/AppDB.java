package ua.artcode.week3.day3.my_version.data_container;

import ua.artcode.week3.day3.my_version.model.Group;

import java.util.ArrayList;

/**
 * Created by Alexey_O on 10.09.2017.
 */
public class AppDB {

    // Fields and properties:
    private ArrayList<Group> groups;

    // Constructors:
    public AppDB() {
    }

    public AppDB(ArrayList<Group> groups) {
        this.groups = groups;
    }

    // Getters and setters;
    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    // Other methods:
    public boolean addGroup(Group group) {  //TODO: addGroup(Group group);
        return false;
    }

    public Group removeGroup(int id) {     //TODO: removeGroup(int id);
        return null;
    }

}
