package ua.artcode.week5.exceptions;

import ua.artcode.week3.day2.design_patterns.social_network.EducationSystemController;
import ua.artcode.week3.day2.design_patterns.social_network.exception.InvalidLoginException;
import ua.artcode.week3.day2.design_patterns.social_network.exception.MyApplicationException;

public class Intro {

    public static void main(String[] args) {
        EducationSystemController systemController =
                new EducationSystemController();
//
//        Course found = systemController.getCourse(-1);
//
//        int i = systemController.createCourse(found);
//
//        systemController.getSocialNetworkApi();

        System.out.println("bla-bla-bla");
        try {
            String res = systemController.login("sdf", "sdfg");
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        } catch (MyApplicationException e) {
            e.printStackTrace();
        }
        System.out.println("bla-bla-bla");  // will not be reached
    }

}
