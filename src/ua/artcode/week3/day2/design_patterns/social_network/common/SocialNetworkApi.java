package ua.artcode.week3.day2.design_patterns.social_network.common;

/**
 * Created by Alexey_O on 12.09.2017.
 */
public interface SocialNetworkApi {

    String login(String email, String pass);

    int createGroup(String name);

}
