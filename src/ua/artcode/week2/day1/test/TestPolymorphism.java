package ua.artcode.week2.day1.test;

import ua.artcode.week2.day1.controller.CompanyController;
import ua.artcode.week2.day1.model.Director;
import ua.artcode.week2.day1.model.Worker;

/**
 * Created by Alexey_O on 07.09.2017.
 */
public class TestPolymorphism {

    public static void main(String[] args) {
        Director director = new Director();
        CompanyController.startWork(director);

        Worker w1 = new Worker();
        w1.getOwnSelf();
    }

}
