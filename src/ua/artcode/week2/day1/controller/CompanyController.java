package ua.artcode.week2.day1.controller;

import ua.artcode.week2.day1.model.Worker;

/**
 * Created by Alexey_O on 07.09.2017.
 */
public class CompanyController {

    // Must be worker, override method work()!
    public static void startWork(Worker worker) {
        worker.work();
    }

}
