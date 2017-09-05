package ua.artcode.week1.day1_homework.model;

/**
 * Created by Alexey_O on 04.09.2017.
 */
public class StudentsAddress {

    private String city = "none";
    private String street = "none";
    private String number = "none";

    public boolean setAddress(String city, String street, String number) {
        if (city == null || street == null || number == null ||
                city.length() < 1 || street.length() < 1 || number.length() < 1) {
            return false;
        }
        this.city = city;
        this.street = street;
        this.number = number;
        return true;
    }

    public String getAddress() {
        return String.format("%s,%s,%s", city, street, number);
    }
}
