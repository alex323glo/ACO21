package ua.artcode.week3.day2.design_patterns.social_network;

import ua.artcode.week3.day2.design_patterns.social_network.common.SocialNetworkApi;
import ua.artcode.week3.day2.design_patterns.social_network.exception.InvalidLoginException;
import ua.artcode.week3.day2.design_patterns.social_network.exception.MyApplicationException;
import ua.artcode.week3.day2.design_patterns.social_network.exception.SocialNetworkException;
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

    public String login(String email, String pass) throws InvalidLoginException, MyApplicationException {

        if (!email.contains("@")) {
            throw new InvalidLoginException("invalid email");
        }

        try {
            String message = socialNetworkApi.login(email, pass);
            return message;
        } catch (SocialNetworkException e) {
            e.printStackTrace();
            throw new MyApplicationException("social network error");
        }

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
