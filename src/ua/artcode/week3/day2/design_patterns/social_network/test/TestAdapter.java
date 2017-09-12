package ua.artcode.week3.day2.design_patterns.social_network.test;

import ua.artcode.week3.day2.design_patterns.social_network.EducationSystemController;
import ua.artcode.week3.day2.design_patterns.social_network.twitter.TwitterApi;
import ua.artcode.week3.day2.design_patterns.social_network.twitter.TwitterSocialNetworkAdapter;

/**
 * Created by Alexey_O on 12.09.2017.
 */
public class TestAdapter {

    public static void main(String[] args) {

        EducationSystemController systemController = new EducationSystemController();

        systemController.setSocialNetworkApi(new  TwitterSocialNetworkAdapter(new TwitterApi()));

    }

}
