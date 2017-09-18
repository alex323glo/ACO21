package ua.artcode.week4.day4.task2;

import ua.artcode.week4.day1.search.LineSearch;
import ua.artcode.week4.day3.task2.Node;
import ua.artcode.week4.day3.task2.NodeUtils;

import java.util.ArrayList;
import java.util.List;

public class TreeFactory {

    public static Node create() {
        return new Node();
    }

    public static Node create(List<Node> nodes, int maxNumOfBranches) {

        if (nodes == null || nodes.size() < 1 || maxNumOfBranches < 1) {
            return null;
        }

        Node head = nodes.remove(0);

        if (nodes.size() > 0) {
            fillBranch(head, nodes, maxNumOfBranches);
        }

        return head;
    }

    private static void fillBranch(Node head, List<Node> queue, int numOfBranches) {

        int iterationsNum = (numOfBranches >= queue.size()) ? queue.size() : numOfBranches;
        List<Node> headChildren= head.getChildren();

        for (int i = 0; i < iterationsNum; i++) {
            headChildren.add(queue.remove(0));
        }

        if (queue.isEmpty()) {
            return;
        }

        for (Node child: headChildren) {
            fillBranch(child, queue, numOfBranches);
        }

    }

}
