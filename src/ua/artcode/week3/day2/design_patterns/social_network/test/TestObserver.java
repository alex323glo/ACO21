package ua.artcode.week3.day2.design_patterns.social_network.test;

import ua.artcode.week3.day2.design_patterns.social_network.EducationSystemController;
import ua.artcode.week3.day2.design_patterns.social_network.observer.Humanitary;
import ua.artcode.week3.day2.design_patterns.social_network.observer.ItStudentSubscriber;

/**
 * Created by Alexey_O on 12.09.2017.
 */
public class TestObserver {

    public static void main(String[] args) {

        EducationSystemController controller = new EducationSystemController();


        controller.subscribe(new ItStudentSubscriber());
        controller.subscribe(new Humanitary());

        controller.notifyAll("New course. Auto QA");

    }

}
