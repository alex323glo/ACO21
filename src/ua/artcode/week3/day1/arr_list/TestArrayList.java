package ua.artcode.week3.day1.arr_list;

import ua.artcode.week3.day1.fin.IPhone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey_O on 09.09.2017.
 */
public class TestArrayList {

    public static void main(String[] args) {
//        ArrayList al = new ArrayList(); //possible variant:
        List al = new ArrayList();

        al.add("Ivan");
        al.add(45);
        al.add(456.23);
        al.add(3, new Object());

        al.set(1, 48);

        Object removedElement1 = al.remove(2);
        Object removedElement2 = al.remove("Ivan");

        Object obj = al.get(2);

        int alSize = al.size();

        List newAl = al.subList(1, 3);

        Object[] objectArray = al.toArray();




        // How to "run" through ArrayList:
        for (int i = 0; i < al.size(); i++) {
            Object element = al.get(i);
        }

        for (Object element: al) {  // (like with simple Object array)

        }


        IPhone phone = new IPhone();
        al.add(phone);


        boolean containsFlag = al.contains(phone); // will return true !
        int indexOfIPhone = al.indexOf(phone);
        Object removeIPhone = al.remove(phone);

        boolean isEmptyFlag = al.isEmpty();

        al.clear();
    }

}
