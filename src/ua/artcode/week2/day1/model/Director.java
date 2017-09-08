package ua.artcode.week2.day1.model;

/**
 * Created by Alexey_O on 07.09.2017.
 */
public class Director extends Worker {  // Director is-a Worker !!!

    private Manager rightHand;          // Director has-a Manager !!!

    public Manager getRightHand() {
        return rightHand;
    }

    public void setRightHand(Manager rightHand) {
        this.rightHand = rightHand;
    }

    @Override
    public void work() {
        System.out.println("Director work method.");
    }

    @Override
    public Director getOwnSelf() {  // instead of protected Worker getOwnSelf()
        return this;
    }

}
