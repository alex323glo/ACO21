package ua.artcode.week2.day1.test;

import ua.artcode.week2.day1.model.Director;
import ua.artcode.week2.day1.model.Manager;

/**
 * Created by Alexey_O on 08.09.2017.
 */
public class TestAggregationComposition {

    public static void main(String[] args) {

        // Lifecycle
        // Aggregation (when Director dies, but manager lives; Director has-a Manager)
        Manager manager = new Manager();
        Director director = new Director();
        director.setRightHand(manager);
        manager = null;

        // Composition (when Manager dies with Director; Director has-a Manager)
        Director director1 = new Director();
        director1.setRightHand(new Manager());
        director1 = null;
    }

}
