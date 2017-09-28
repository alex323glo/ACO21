package ua.artcode.controller;

import ua.artcode.exception.*;
import ua.artcode.model.*;

import java.util.List;

public interface UserController {   // endpoint

    //
    User register(String login, String pass, String phone) throws RegisterException;

    // generates access token (String token):
    String login(String login, String pass) throws LoginCredentialException;

    Address checkAddress(String street, String num, String accessToken) throws AppException;

    Order makeOrder(Order orderRequest, double price, String accessToken) throws AppException;

    Order findDriver(Order order, String accessToken) throws AppException;

    Order getOrderInfo(int orderId, String accessToken) throws AppException;

    String cancelOrder(int orderId, String accessToken) throws AppException;

    List<Order> showHistory(String accessToken) throws AppException;

}
