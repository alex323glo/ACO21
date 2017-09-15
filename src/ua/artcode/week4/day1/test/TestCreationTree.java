package ua.artcode.week4.day1.test;

import ua.artcode.week4.day1.recursion.tree.TreeNode;
import ua.artcode.week4.day1.utils.TreeNodeUtils;

import java.util.Arrays;

public class TestCreationTree {

    public static void main(String[] args) {

        TreeNode employee11 = new TreeNode(250);
        TreeNode employee12 = new TreeNode(250);
        TreeNode employee13 = new TreeNode(300);

        TreeNode employee21 = new TreeNode(250);
        TreeNode employee22 = new TreeNode(150);

        TreeNode employee31 = new TreeNode(300);
        TreeNode employee32 = new TreeNode(150);
        TreeNode employee33 = new TreeNode(200);

        TreeNode employee41 = new TreeNode(300);
        TreeNode employee42 = new TreeNode(350);

        TreeNode manager1 = new TreeNode(600, Arrays.asList(employee11, employee12, employee13));
        TreeNode manager2 = new TreeNode(550, Arrays.asList(employee21, employee22));
        TreeNode manager3 = new TreeNode(750, Arrays.asList(employee31, employee32, employee33));
        TreeNode manager4 = new TreeNode(500, Arrays.asList(employee41, employee42));

        TreeNode director = new TreeNode(1000, Arrays.asList(manager1, manager2, manager3, manager4));

        int wholeAmount = TreeNodeUtils.count(director);

        System.out.println(wholeAmount);

    }

}
