package ua.artcode.week3.day2.design_patterns.social_network.test;

import ua.artcode.week3.day2.design_patterns.social_network.EducationSystemController;

/**
 * Created by Alexey_O on 12.09.2017.
 */
public class TestProxy {

    public static void main(String[] args) {

        EducationSystemController controller = new EducationSystemController();

        String res = controller.login("alex323glo", "12345");

        System.out.println(res);

    }

}
