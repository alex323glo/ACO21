package ua.artcode.week4.day3.task2;

public class NodeUtils {

    public static int countTreeElements(Node head) {

        if (head.getChildren().isEmpty()) {
            return 1;
        }

        int sum = 1;

        for (Node childNode: head.getChildren()) {
            sum += countTreeElements(childNode);
        }

        return sum;

    }

    public static void printTree(Node head) {
        printTreeDeep(head, 0);
    }

    private static void printTreeDeep(Node head, int depth) {


        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(head.getValue());

        if (head.getChildren().isEmpty()) {
            return;
        }

        for (Node childNode: head.getChildren()) {
            printTreeDeep(childNode, depth + 1);
        }

        return;
    }

}
