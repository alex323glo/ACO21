package ua.artcode.week3.day2.design_patterns.social_network.observer;

/**
 * Created by Alexey_O on 12.09.2017.
 */
public class Humanitary implements ISubscriber {

    @Override
    public void notify(String message) {
        System.out.println("\"" + message + "\" mark as spam");
    }

}
