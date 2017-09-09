package ua.artcode.week3.day1.fin;

/**
 * Created by Alexey_O on 09.09.2017.
 */
public class ClientPhoneTest {

    public static void main(String[] args) {
        IShop shop = visit();
        IPhone iPhone = shop.buy();

        iPhone.start();
    }

    public static IShop visit() {
        //return new IChinaStore();
        return new IShop();
    }

    public static IChinaStore visitChinaShop() {
        return new IChinaStore();
    }

}
