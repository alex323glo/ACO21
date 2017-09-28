package ua.artcode.controller;

import ua.artcode.model.*;
import ua.artcode.exception.*;
import ua.artcode.db.AppDB;

import java.util.List;

public class UserControllerImpl implements UserController {

    // Fields and properties:
    private AppDB appDB;


    // Constructors:
    public UserControllerImpl(AppDB appDB) {
        this.appDB = appDB;
    }


    // Override: implemented methods of UserController interface:
    @Override
    public User register(String login, String pass, String phone) throws RegisterException {

        User user = new User();
        user.setName(login);
        user.setPass(pass);
        user.setPhone(phone);

        // user data validation (if something wrong - through RegisterException) ...

        return appDB.addUser(user);
    }

    @Override
    public String login(String login, String pass) throws LoginCredentialException {

        User user = new User();
        user.setName(login);
        user.setPass(pass);

        return appDB.createAccessToken(user);
    }

    @Override
    public Address checkAddress(String street, String num, String accessToken) throws AppException {

        if (!appDB.hasToken(accessToken)) {
            throw new AppException("No access, login first!");
        }

        // uses Google Maps API ...

        return null;
    }

    @Override
    public Order makeOrder(Order orderRequest, double price, String accessToken) throws AppException {

        if (!appDB.hasToken(accessToken)) {
            throw new AppException("No access, login first!");
        }

        // order data validation (if something wrong - through some exception) ...

        // some business logic ...

        // check address [optional] ...

        // use Google Maps API ...

        // count distance ...

        // count price ...

        return appDB.addOrder(orderRequest);
    }

        // submit in view (when makes order):
    @Override
    public Order findDriver(Order order, String accessToken) throws AppException {

        if (!appDB.hasToken(accessToken)) {
            throw new AppException("No access, login first!");
        }



        return null;
    }

    @Override
    public Order getOrderInfo(int orderId, String accessToken) throws AppException {

        if (!appDB.hasToken(accessToken)) {
            throw new AppException("No access, login first!");
        }

        return appDB.getOrderById(orderId);
    }

    @Override
    public String cancelOrder(int orderId, String accessToken) throws AppException {

        Order found = getOrderInfo(orderId, accessToken);

        if (found == null) {
            throw new NoOrderFoundException("no order with id " + orderId);
        }

        found.setOrderState(OrderState.CANCELED);
        User driver = found.getDriver();

        // notify driver ...

        // send message ...

        return "canceled order";
    }

    @Override
    public List<Order> showHistory(String accessToken) throws AppException {

        if (!appDB.hasToken(accessToken)) {
            throw new AppException("No access, login first!");
        }

        return null;
    }

}
