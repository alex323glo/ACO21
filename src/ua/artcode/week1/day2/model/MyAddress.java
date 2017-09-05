package ua.artcode.week1.day2.model;

/**
 * Created by Alexey_O on 05.09.2017.
 */
public class MyAddress {

    // Fields and properties:
    private String city = "none";
    private String street = "none";
    private String houseNum = "none";

    // Constructors:
    public MyAddress() {

    }

    public MyAddress(String city, String street, String houseNum) {
        setCity(city);
        setStreet(street);
        setHouseNum(houseNum);
    }

    // Getters and setters:
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !city.isEmpty()) {
            this.city = city;
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street != null && !street.isEmpty()) {
            this.street = street;
        }
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        if (houseNum != null && !houseNum.isEmpty()) {
            this.houseNum = houseNum;
        }
    }
}
