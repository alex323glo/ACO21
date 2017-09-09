package ua.artcode.week2.day2.model_logger;

/**
 * Created by Alexey_O on 08.09.2017.
 */
public class FileLogger extends BaseLogger {

    /*@Override
    public void start() {   // ERROR: Final method can't be overrode!

    }*/

    @Override
    public void action() {
        System.out.println("FileLogger acts!");
    }

}
