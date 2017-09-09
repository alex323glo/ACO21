package ua.artcode.week2.day2.test;

import ua.artcode.week2.day2.model_logger.BaseLogger;
import ua.artcode.week2.day2.model_logger.ConsoleLogger;
import ua.artcode.week2.day2.model_logger.FileLogger;

/**
 * Created by Alexey_O on 08.09.2017.
 */
public class TestAbstraction {

    public static void main(String[] args) {
        FileLogger fileLogger = new FileLogger();
        fileLogger.start();

        BaseLogger someLogger = new FileLogger();

        startLogging(new ConsoleLogger());
        startLogging(new FileLogger());
    }

    public static void startLogging(BaseLogger logger) {
        logger.start();
    }

}
