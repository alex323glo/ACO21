package ua.artcode.week3.day2.design_patterns.social_network.test;

import ua.artcode.week3.day2.design_patterns.social_network.EducationSystemController;
import ua.artcode.week3.day2.design_patterns.social_network.exception.InvalidLoginException;
import ua.artcode.week3.day2.design_patterns.social_network.exception.MyApplicationException;

/**
 * Created by Alexey_O on 12.09.2017.
 */
public class TestProxy {

    public static void main(String[] args) {

        EducationSystemController controller = new EducationSystemController();

        String res = null;
        try {
            res = controller.login("alex323glo", "12345");
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        } catch (MyApplicationException e) {
            e.printStackTrace();
        }

        System.out.println(res);

    }

}
