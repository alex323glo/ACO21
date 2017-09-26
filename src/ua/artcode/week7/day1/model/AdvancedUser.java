package ua.artcode.week7.day1.model;

import java.util.Date;

public class AdvancedUser extends User {

    public AdvancedUser(int id, double salary, String name, Date birth) {
        super(id, salary, name, birth);
    }

    // Will be compared ONLY by id:

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        AdvancedUser temp = (AdvancedUser) obj;

        return getId() == temp.getId();
    }
}
