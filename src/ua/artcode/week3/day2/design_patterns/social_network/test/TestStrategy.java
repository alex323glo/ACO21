package ua.artcode.week3.day2.design_patterns.social_network.test;

import ua.artcode.week3.day2.design_patterns.social_network.EducationSystemController;
import ua.artcode.week3.day2.design_patterns.social_network.SocialNetworkApiFactory;
import ua.artcode.week3.day2.design_patterns.social_network.facebook.FacebookApi;
import ua.artcode.week3.day2.design_patterns.social_network.vk.VkApi;

/**
 * Created by Alexey_O on 12.09.2017.
 */
public class TestStrategy {

    public static void main(String[] args) {
        EducationSystemController systemController = new EducationSystemController();

        systemController.setSocialNetworkApi(new FacebookApi());
        String res1 = systemController.login("email", "1234");
        System.out.println(res1);

        systemController.setSocialNetworkApi(SocialNetworkApiFactory.create());
        String res2 = systemController.login("email", "1234");
        System.out.println(res2);
    }

}
