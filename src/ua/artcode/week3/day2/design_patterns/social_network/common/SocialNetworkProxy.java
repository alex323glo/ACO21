package ua.artcode.week3.day2.design_patterns.social_network.common;

/**
 * Created by Alexey_O on 12.09.2017.
 */
public class SocialNetworkProxy implements SocialNetworkApi {

    private SocialNetworkApi target;

    public SocialNetworkProxy(SocialNetworkApi target) {
        this.target = target;
    }

    @Override
    public String login(String email, String pass) {

        // validation
        // preparation
        System.out.printf("email %s, pass %s", email, pass);


        return target.login(email, pass);   // !!!
    }

    @Override
    public int createGroup(String name) {



        return target.createGroup(name);    // !!!
    }
}
