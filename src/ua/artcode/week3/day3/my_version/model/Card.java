package ua.artcode.week3.day3.my_version.model;

/**
 * Created by Alexey_O on 10.09.2017.
 */
public class Card {

    // Fields and properties:
    private int id;
    private String frontSide;
    private String backSide;

    // Constructors:
    public Card() {
    }

    public Card(int id, String frontSide, String backSide) {
        this.id = id;
        this.frontSide = frontSide;
        this.backSide = backSide;
    }

    // Getters and setters:
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrontSide() {
        return frontSide;
    }

    public void setFrontSide(String frontSide) {
        this.frontSide = frontSide;
    }

    public String getBackSide() {
        return backSide;
    }

    public void setBackSide(String backSide) {
        this.backSide = backSide;
    }

}
