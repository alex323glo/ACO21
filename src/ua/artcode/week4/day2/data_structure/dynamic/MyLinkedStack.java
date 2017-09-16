package ua.artcode.week4.day2.data_structure.dynamic;

import ua.artcode.week4.day2.data_structure.common.MyStack;
import ua.artcode.week4.day2.utils.NodeUtils;

public class MyLinkedStack implements MyStack {

    private Node top;

    public MyLinkedStack() {
    }

    public MyLinkedStack(Node top) {
        this.top = top;
    }

    @Override
    public void push(Object object) {
        if (object == null) {
            return;
        }

        if (top == null) {
            top = new Node(object);
        } else {
            Node newNode = new Node(object, top);
            top = newNode;

            // possible:
//            top = new Node(object, top);
        }

    }

    @Override
    public Object pop() {

        if (top == null) {
            System.out.println("Stack is empty!");
            return null;
        }

        Object forRet = top.getValue();
        top = top.getNext();

        return forRet;
    }

    @Override
    public String toString() {
        return "MyLinkedStack{" +
                "top=" + NodeUtils.toString1(top) +
                '}';
    }
}
