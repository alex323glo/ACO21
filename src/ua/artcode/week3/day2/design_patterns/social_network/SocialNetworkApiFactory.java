package ua.artcode.week3.day2.design_patterns.social_network;

import ua.artcode.week3.day2.design_patterns.social_network.common.SocialNetworkApi;
import ua.artcode.week3.day2.design_patterns.social_network.common.SocialNetworkProxy;
import ua.artcode.week3.day2.design_patterns.social_network.vk.PowerPoint;
import ua.artcode.week3.day2.design_patterns.social_network.vk.VkApi;
import ua.artcode.week3.day2.design_patterns.social_network.vk.VkServer;

/**
 * Created by Alexey_O on 12.09.2017.
 */
public class SocialNetworkApiFactory {

    public static SocialNetworkApi create() {
        return new SocialNetworkProxy(
                new VkApi(
                        new VkServer(
                                new PowerPoint(220, "USA"),
                                "i7",
                                128,
                                3000
                        )
                )
        );
    }

}
