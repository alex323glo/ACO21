package ua.artcode.week6.day2_io.utils;

import ua.artcode.week6.day2_io.model.Robot;

import java.io.*;

public class IOUtils {

    public static void writeRobot(String fileName, Robot robot) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileName))) { // named as: "try" with resources

            String formatted = String.format("id:%d,model:%s,price:%.2f",
                    robot.getId(), robot.getModel(), robot.getPrice());
            printWriter.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Robot readRobot(String fileName) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        try {

            String robotStr = bufferedReader.readLine();    // read line with robot string from file
            if (robotStr != null) {

                Robot robot = new Robot();                          // create empty robot object

                String[] robotStrParts = robotStr.split(",");   // parse robot string
                                                                        // to robot properties substrings

                for (String part: robotStrParts) {

                    String[] keyValue = part.split(":");        // parse robot property substring to
                                                                        // key-value pairs (2-element arrays)
                    String key = keyValue[0];
                    String value = keyValue[1];

                    switch (key) {                                      // convert string properties value
                                                                        // to their value format (typed by key)
                                                                        // and assign to robot object
                        case "id":
                            long id = Long.parseLong(value);
                            robot.setId(id);
                            break;
                        case "model":
                            String model = value;
                            robot.setModel(model);
                            break;
                        case "price":
                            double price = Double.parseDouble(value);
                            robot.setPrice(price);
                            break;
                    }
                }

                return robot;

            }

        } catch (IOException e) {       // if can't read robot from file
            e.printStackTrace();
        }

        return null;    // if robot wasn't read successfully
    }


    // Serialization
    public static<T extends Serializable> void save(T any, String path) {
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(
                             new FileOutputStream(path))) {

            objectOutputStream.writeObject(any);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialization
    public static<T extends Serializable> T load(String path) throws FileNotFoundException {
        try {
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(
                            new FileInputStream(path)); // throws FileNotFoundException !

            T t = (T) objectInputStream.readObject();
            return t;
        } catch (ClassNotFoundException cnfe) {
            System.out.println("was caught ClassNotFoundException");
            cnfe.printStackTrace();
        } catch (ClassCastException cce) {
            System.out.println("was caught ClassCastException");
            cce.printStackTrace();
        } catch (IOException ioe) {
            System.out.println("was caught IOException");
            ioe.printStackTrace();
        }
        return null;
    }

}
