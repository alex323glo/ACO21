package ua.artcode.week3.day3.my_version.test;

import ua.artcode.week1.day2_homework.part1.utils.TestUtils;
import ua.artcode.week3.day3.my_version.controler.MainController;
import ua.artcode.week3.day3.my_version.controler.MainControllerFactory;
import ua.artcode.week3.day3.my_version.model.Card;
import ua.artcode.week3.day3.my_version.model.Group;

import java.util.ArrayList;

/**
 * Created by Alexey_O on 10.09.2017.
 */
public class TestMainController {

    public static void main(String[] args) {
        boolean testResult = true;

        // Testing interface methods:
        testResult &= testRemoveCardCorrectly();
        testResult &= testRemoveCardWrongly();

        testResult &= testAddCardCorrectly();
        testResult &= testAddCardWrongly();

        testResult &= testCreateGroupCorrectly();
        testResult &= testCreateGroupWrongly();

        testResult &= testGetCardsOfGroup();

        System.out.println(" *** TDD result: " + (testResult ? "passed." : "not passed."));
    }

    private static boolean testRemoveCardCorrectly() {
        MainController mainController = MainControllerFactory.create();
        Card expectedCard = new Card(0, "front", "back");

        mainController.getAppDB().addGroup(new Group(0, new ArrayList<>()));
        mainController.addCard(0, expectedCard);

        boolean testResult = (mainController.removeCard(0, 0) == expectedCard);

        TestUtils.printTestsResult("testAddCardCorrectly",
                "MainController",
                "addCard()",
                testResult);
        return testResult;
    }

    private static boolean testRemoveCardWrongly() {
        MainController mainController = MainControllerFactory.create();
        Card expected = null;
        boolean testResult = true;

        testResult &= (mainController.removeCard(0, 0) == expected);

        mainController.getAppDB().addGroup(new Group(0, new ArrayList<>()));

        testResult &= (mainController.removeCard(0, 0) == expected);

        mainController.addCard(0, new Card(0, "front", "back"));

        testResult &= (mainController.removeCard(-1, 0) == expected);
        testResult &= (mainController.removeCard(0, -1) == expected);
        testResult &= (mainController.removeCard(-1, -1) == expected);

        TestUtils.printTestsResult("testRemoveCardWrongly",
                "MainController",
                "removeCard()",
                testResult);
        return testResult;
    }

    private static boolean testAddCardCorrectly() {
        MainController mainController = MainControllerFactory.create();
        mainController.getAppDB().addGroup(new Group(0, new ArrayList<>()));
        boolean expected = true;
        boolean testResult = (mainController.addCard(0, new Card()) == expected);

        TestUtils.printTestsResult("testAddCardCorrectly",
                "MainController",
                "addCard()",
                testResult);
        return testResult;
    }

    private static boolean testAddCardWrongly() {
        MainController mainController = MainControllerFactory.create();
        boolean expected = false;
        boolean testResult = true;

        testResult &= (mainController.addCard(0, new Card()) == expected);

        mainController.getAppDB().addGroup(new Group());

        testResult &= (mainController.addCard(0, null) == expected);
        testResult &= (mainController.addCard(-1, new Card()) == expected);
        testResult &= (mainController.addCard(1, new Card()) == expected);

        TestUtils.printTestsResult("testAddCardWrongly",
                "MainController",
                "addCard()",
                testResult);
        return testResult;
    }

    private static boolean testCreateGroupCorrectly() {
        MainController mainController = MainControllerFactory.create();
        boolean expected = true;
        boolean testResult = (mainController.createGroup(new Group()) == expected);

        TestUtils.printTestsResult("testCreateGroupCorrectly",
                "MainController",
                "createGroup()",
                testResult);
        return testResult;
    }

    private static boolean testCreateGroupWrongly() {
        MainController mainController = MainControllerFactory.create();
        boolean expected = false;
        boolean testResult = (mainController.createGroup(null) == expected);

        TestUtils.printTestsResult("testCreateGroupWrongly",
                "MainController",
                "createGroup()",
                testResult);
        return testResult;
    }

    private static boolean testGetCardsOfGroup() {
        MainController mainController1 = MainControllerFactory.create();
        MainController mainController2 = MainControllerFactory.create();
        ArrayList<Card> testCardList = new ArrayList<>();
        int testGroupId = 1;
        ArrayList<Card> expected1 = null, expected2 = testCardList;
        boolean testResult = true;

        testCardList.add(new Card(testGroupId, "Hello", "Привіт"));
        mainController2.getAppDB().getGroupList().add(new Group(1, testCardList));

        testResult &= (mainController1.getCardsOfGroup(testGroupId) == expected1);
        testResult &= (mainController2.getCardsOfGroup(testGroupId) == expected2);

        TestUtils.printTestsResult("testGetCardsOfGroup",
                "MainController",
                "getCardsOfGroup()",
                testResult);
        return testResult;
    }

}
