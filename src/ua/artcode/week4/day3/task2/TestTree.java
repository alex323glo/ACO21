package ua.artcode.week4.day3.task2;

public class TestTree {

    public static void main(String[] args) {

        Node node1 = new Node(1);



        Node node11 = new Node(11);
        Node node12 = new Node(12);
        Node node13 = new Node(13);


        Node node111 = new Node(111);
        Node node112 = new Node(112);

        Node node121 = new Node(121);
        Node node122 = new Node(122);
        Node node123 = new Node(123);
        Node node124 = new Node(124);

        Node node131 = new Node(131);


        Node head = node1;

        node11.joinWide(node111).joinWide(node112);
        node12.joinWide(node121).joinWide(node122).joinWide(node123).joinWide(node124);

        node1.joinWide(node11).joinWide(node12);

        node1.joinDeep(node13).joinDeep(node131);

        System.out.println();

        NodeUtils.printTree(head);

        System.out.println("Number of elements (nodes): " + NodeUtils.countTreeElements(head));

    }

}
