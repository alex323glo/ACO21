package ua.artcode.week4.day4.task2;

import ua.artcode.week4.day3.task2.Node;
import ua.artcode.week4.day3.task2.NodeUtils;

import java.util.ArrayList;
import java.util.List;

public class TestTreeFactory {

    public static void main(String[] args) {

        List<Node> nodeList = new ArrayList<>();

        for (int i = 1; i < 7; i++) {
            nodeList.add(new Node(i));
        }

        Node treeHead = TreeFactory.create(nodeList, 2);

        NodeUtils.printTree(treeHead);

    }

}
