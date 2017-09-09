package ua.artcode.week3.day1.wrappers;

/**
 * Created by Alexey_O on 10.09.2017.
 */
public class DataContainer {

    private Object value;

    public DataContainer(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
