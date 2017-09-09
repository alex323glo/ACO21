package ua.artcode.week2.day2.model_logger;

/**
 * Created by Alexey_O on 08.09.2017.
 */
public abstract class BaseLogger {

    public final void start() {        // Will NOT be overrode in child class!
        System.out.println("Start action.");

        action();

        System.out.println("End action.");
    }

    public abstract void action();  // Will be overrode in the child class!

}
