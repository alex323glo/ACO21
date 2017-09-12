package ua.artcode.week3.day2.design_patterns.social_network.facebook;

import ua.artcode.week3.day2.design_patterns.social_network.common.SocialNetworkApi;

/**
 * Created by Alexey_O on 11.09.2017.
 */
public class FacebookApi implements SocialNetworkApi {

    @Override
    public String login(String email, String pass) {
        return "facebook key";
    }

    @Override
    public int createGroup(String name) {
        System.out.println("Facebook group " + name);
        return 1;
    }

    public FacebookGroup get(int id) {
        return new FacebookGroup();
    }

}
