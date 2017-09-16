package ua.artcode.week4.day3.task2;

public class NodeUtils {

    public static int countTreeElements(MyNode head) {

        if (head.getChildren().isEmpty()) {
            return 1;
        }

        int sum = 1;

        for (MyNode childNode: head.getChildren()) {
            sum += countTreeElements(childNode);
        }

        return sum;

    }

    public static void printTree(MyNode head) {
        printTreeDeep(head, 0);
    }

    private static void printTreeDeep(MyNode head, int depth) {


        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(head.getValue());

        if (head.getChildren().isEmpty()) {
            return;
        }

        for (MyNode childNode: head.getChildren()) {
            printTreeDeep(childNode, depth + 1);
        }

        return;
    }

}
