package ua.artcode.week4.day2.test;

import ua.artcode.week4.day1.utils.time.ITimeAction;
import ua.artcode.week4.day1.utils.time.TimeCounter;
import ua.artcode.week4.day2.data_structure.dynamic.Node;
import ua.artcode.week4.day2.utils.NodeUtils;

public class LinkNodesTest {

    public static void main(String[] args) {

        test1();
        test2();
        test3();
        test4();


        Node head = NodeUtils.createChain(1_000);

        System.out.println("Cycle variant: " + TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                NodeUtils.toString1(head);
            }
        }));

        System.out.println("Recursive variant: " + TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                NodeUtils.toString2(head);
            }
        }));

        System.out.println(NodeUtils.toString1(head));
        System.out.println(NodeUtils.toString2(head));


        Node newNode = NodeUtils.addToHead(head, new Node(34, null));
        System.out.println(NodeUtils.toString1(newNode));

    }

    public static void test1() {

        Node head = new Node(1);

        Node second = new Node(2, head);

        Node third = new Node(3, second);

    }

    public static void test2() {

        Node head = new Node(1);

        Node second = new Node(2, head);

        Node third = new Node(3, second);

        // Will cause NullPointerException:
//        third = null;
//        second = null;
//        System.out.println( head.getNext().getValue() );

        head = null;
        second = null;
        third.getNext().getNext().getValue();   // Will return "1" !

    }

    public static void test3() {

        Node head = new Node(1, null);

        for (int i = 0; i < 10; i++) {
            head = new Node(i, head);
        }

    }

    public static void test4() {

        Node head = new Node(1, null);
        Node last = head;

        for (int i = 0; i < 10; i++) {
            last = new Node(i, last);
        }

    }



}
