package ua.artcode.week6.day2_io.design_patterns.decorator;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestDecorator {

    public static void main(String[] args) {
        ActionNode actionNode2 = new ActionNode("2", null);
        ActionNode actionNode1 = new ActionNode("1", actionNode2);
        ActionNode actionNode = new ActionNode("0", actionNode1);

        System.out.println(actionNode.action());

        try {

//            String fileName = "test-resources/week6_day2_io/write_res.txt";
//
//            BufferedReader bufferedReader1 = new BufferedReader(
//                    new InputStreamReader(
//                            new BufferedInputStream(
//                                    new FileInputStream(fileName))));
//
//            while (bufferedReader1.ready()) {
//                String next = bufferedReader1.readLine();
//                System.out.println(next);
//            }
//            bufferedReader1.close();

            //-----------------------------------------

            BufferedReader bufferedReader2 = new BufferedReader(
                    new InputStreamReader(
                            new BufferedInputStream(
                                    System.in)));

            while (bufferedReader2.ready()) {
                String next = bufferedReader2.readLine();
                System.out.println(next);
            }


        } catch (FileNotFoundException fnfe) {
            System.out.println("FileNotFoundException: \"" + fnfe.getMessage() + "\"");
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            System.out.println("IOException: \"" + ioe.getMessage() + "\"");
            ioe.printStackTrace();
        }
    }

}
