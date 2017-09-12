package ua.artcode.week3.day2.design_patterns.social_network;

import ua.artcode.week1.day2_homework.part1.model.Student;
import ua.artcode.week3.day2.design_patterns.social_network.common.SocialNetworkApi;
import ua.artcode.week3.day2.design_patterns.social_network.observer.ISubscriber;

import java.util.ArrayList;

/**
 * Created by Alexey_O on 11.09.2017.
 */
public class EducationSystemController {

    private ArrayList<ISubscriber> subscriberList = new ArrayList<>();
    private SocialNetworkApi socialNetworkApi = SocialNetworkApiFactory.create();

    public SocialNetworkApi getSocialNetworkApi() {
        return socialNetworkApi;
    }

    public void setSocialNetworkApi(SocialNetworkApi socialNetworkApi) {
        this.socialNetworkApi = socialNetworkApi;
    }

    // returns course's id
    public int createCourse(Course course) {
        return socialNetworkApi.createGroup(course.getName());
    }

    public String login(String email, String pass) {
        return socialNetworkApi.login(email, pass);
    }

    public Course getCourse(int id) {
        return null;
    }

    public void subscribe(ISubscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void notifyAll(String message) {
        for (ISubscriber element: subscriberList) {
            element.notify(message);
        }
    }

}
