package ua.artcode.week4.day2.utils;

import ua.artcode.week4.day2.data_structure.dynamic.Node;

public class NodeUtils {

    public static Node createChain(int size) {
        Node head = new Node(0, null);
        Node last = head;

        for (int i = 1; i < size; i++) {
            last.setNext(new Node(i, null));
            last = last.getNext();
        }

        return head;
    }

    // find last, add newNode to the last element:
    public static void addToTail(Node head, Node nextNode) {

        Node current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(nextNode);
    }

    public static Node addToHead(Node head, Node newNode) {
        newNode.setNext(head);
        return newNode;
    }

    // Cycle variant:
    public static String toString1(Node head) {

        Node current = head;
        StringBuilder stringBuilder = new StringBuilder("");

        while (current != null) {
            stringBuilder.append(current.getValue().toString());
            stringBuilder.append(" -> ");
            current = current.getNext();
        }

        return stringBuilder.toString();

    }

    // Recursive variant:
    public static String toString2(Node head) {

        return (head != null) ? head.getValue().toString() + " -> " + toString2(head.getNext()) : "";

    }
}