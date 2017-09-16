package ua.artcode.week4.day3.task2;

public class TestTree {

    public static void main(String[] args) {

        MyNode node1 = new MyNode(1);



        MyNode node11 = new MyNode(11);
        MyNode node12 = new MyNode(12);
        MyNode node13 = new MyNode(13);


        MyNode node111 = new MyNode(111);
        MyNode node112 = new MyNode(112);

        MyNode node121 = new MyNode(121);
        MyNode node122 = new MyNode(122);
        MyNode node123 = new MyNode(123);
        MyNode node124 = new MyNode(124);

        MyNode node131 = new MyNode(131);


        MyNode head = node1;

        node11.joinWide(node111).joinWide(node112);
        node12.joinWide(node121).joinWide(node122).joinWide(node123).joinWide(node124);

        node1.joinWide(node11).joinWide(node12);

        node1.joinDeep(node13).joinDeep(node131);

        System.out.println();

        NodeUtils.printTree(head);

        System.out.println("Number of elements (nodes): " + NodeUtils.countTreeElements(head));

    }

}
