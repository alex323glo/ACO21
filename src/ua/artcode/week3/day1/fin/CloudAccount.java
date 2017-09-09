package ua.artcode.week3.day1.fin;

/**
 * Created by Alexey_O on 09.09.2017.
 */
public class CloudAccount {

    private String name;
    private String pass;

    public CloudAccount(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
