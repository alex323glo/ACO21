package ua.artcode.week3.day2.design_patterns.social_network.observer;

/**
 * Created by Alexey_O on 12.09.2017.
 */
public class ItStudentSubscriber implements ISubscriber {

    @Override
    public void notify(String message) {
        System.out.println("I will read it (important) \"" + message + "\"");
    }

}
