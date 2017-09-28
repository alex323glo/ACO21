package ua.artcode.db;

import ua.artcode.exception.LoginCredentialException;
import ua.artcode.model.Order;
import ua.artcode.model.User;

import java.util.*;

public class AppDB {    // data (models) container

    // Properties and fields:
    private int userIdCount;
    private long orderIdCount;

    private Map<String, User> accessTokenUserMap;   // < accessToken, user >

    private Map<Integer, User> userMap;             // < userID, user >

    private Map<Long, Order> orderMap;              // < orderID, order >

    private List<Order> history;        // to store currentOrders' history

    private List<Order> currentOrders;         // to operate active orders


    // Constructors:
    public AppDB() {

        accessTokenUserMap = new HashMap<>();
        userMap = new TreeMap<>();

        history = new ArrayList<>();
        currentOrders = new LinkedList<>();

    }


    // Public methods:
        // register:
    public User addUser(User user) {
        user.setId(userIdCount);
        userMap.put(userIdCount, user);

        userIdCount++;
        return user;
    }

        // login:
    public String createAccessToken(User user) throws LoginCredentialException {

        User found = null;

        try {

            found = userMap.values().stream()
                    .filter(u -> u.getPhone().equals(user.getPhone()))
                    .filter(u -> u.getPass().equals(user.getPass()))
                    .findFirst().get();

        } catch (NoSuchElementException e) {
            throw new LoginCredentialException("invalid login or pass : " + e.getMessage());
        }

        String accessKey = UUID.randomUUID().toString();
        accessTokenUserMap.put(accessKey, found);

        return accessKey;
    }

        // adds order to orderList and history:
    public Order addOrder(Order order) {
        order.setId(orderIdCount);
        currentOrders.add(order);
        orderMap.put(orderIdCount, order);

        orderIdCount++;
        return order;
    }

        // searches for order in orderMap:
    public Order getOrderById(int id) {
        return orderMap.get(id);
    }

        // checks if such token exists in accessTokenUserMap:
    public boolean hasToken(String accessToken) {
        return accessTokenUserMap.containsKey(accessToken);
    }

}
