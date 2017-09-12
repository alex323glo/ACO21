package ua.artcode.week3.day2.design_patterns.social_network.vk;

import ua.artcode.week3.day2.design_patterns.social_network.common.SocialNetworkApi;

/**
 * Created by Alexey_O on 11.09.2017.
 */
public class VkApi implements SocialNetworkApi {

    private VkServer server;

    public VkApi(VkServer server) {
        this.server = server;
    }

    @Override
    public String login(String email, String pass) {
        return "vk key";
    }

    @Override
    public int createGroup(String name) {
        System.out.println("Vk group " + name);
        return 1;
    }

    public VkGroup get(int id) {
        return new VkGroup();
    }

}
