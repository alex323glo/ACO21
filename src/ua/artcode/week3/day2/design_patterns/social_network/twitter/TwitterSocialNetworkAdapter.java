package ua.artcode.week3.day2.design_patterns.social_network.twitter;

import ua.artcode.week3.day2.design_patterns.social_network.common.SocialNetworkApi;

/**
 * Created by Alexey_O on 12.09.2017.
 */
public class TwitterSocialNetworkAdapter implements SocialNetworkApi {

    private TwitterApi twitterApi;

    public TwitterSocialNetworkAdapter(TwitterApi twitterApi) {
        this.twitterApi = twitterApi;
    }

    @Override
    public String login(String email, String pass) {
        return null;
    }

    @Override
    public int createGroup(String name) {

        String postId = twitterApi.createPost(name);

        String intValue = postId.split("=")[1];

        return Integer.parseInt(intValue);
    }

}
