package ua.artcode.week4.day_4_homework_1.test;

import ua.artcode.week4.day_4_homework_1.enum_tutor.Compass;
import ua.artcode.week4.day_4_homework_1.enum_tutor.Position;
import ua.artcode.week4.day_4_homework_1.enum_tutor.WeekDays;

import java.awt.*;
import java.util.Arrays;

public class TestEnum {

    public static void main(String[] args) {

//        testStructure();

        testBehaviour();

    }

    private static void testStructure() {

        // Compass enum:

        Compass[] compass = {Compass.NORTH, Compass.SOUTH, Compass.EAST, Compass.WEST};

        System.out.println(compass[0]);
        System.out.println(Arrays.toString(compass));

        System.out.println("Where to go:");
        for (Compass direction : compass) {
            switch (direction) {
                case EAST:
                    System.out.println("Go " + direction + " - be rich!");
                    break;
                case WEST:
                    System.out.println("Go " + direction + " - be pure!");
                    break;
                case NORTH:
                    System.out.println("Go " + direction + " - be COLD!!!");
                    break;
                default:
                    System.out.println("Go " + direction + " - no way...");
            }
        }

    }


    private static void testBehaviour() {

        // WeekDays enum:

        System.out.print("Week days: ");
        for (WeekDays day: WeekDays.values()) {
            System.out.print(day + "; ");
        }
        System.out.println();

        // Position enum:

        System.out.println("Career progress:");
        Position position = Position.JUNIOR;
        position.promote().promote().promote().demote().demote().demote();

        System.out.println("Possible positions:");
        for (Position post: Position.values()) {
            System.out.println(post);
        }

    }

}
