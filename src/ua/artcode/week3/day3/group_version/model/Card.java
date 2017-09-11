package ua.artcode.week3.day3.group_version.model;

/**
 * Created by Alexey_O on 10.09.2017.
 */
public class Card {

    private int id;
    private String front;
    private String back;

    public Card() {
    }

    public Card(int id, String front, String back) {
        this.id = id;
        this.front = front;
        this.back = back;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", front='" + front + '\'' +
                ", back='" + back + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (getId() != card.getId()) return false;
        if (getFront() != null ? !getFront().equals(card.getFront()) : card.getFront() != null) return false;
        return getBack() != null ? getBack().equals(card.getBack()) : card.getBack() == null;
    }
}
