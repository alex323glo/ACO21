package ua.artcode.week4.day1.utils;

import ua.artcode.week4.day1.recursion.tree.TreeNode;

public class TreeNodeUtils {

    public static int count(TreeNode root) {

        if (root.getSlaves().isEmpty()) {
            return root.getAmount();                // exit point of recursion!!!
        }

        int amountSum = root.getAmount();

        for (TreeNode slave: root.getSlaves()) {
            amountSum += count(slave);              // entry point of recursion!!!
        }

        return amountSum;                           // exit point of recursion!!!
    }

}
