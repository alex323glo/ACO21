package ua.artcode.week4.day3.task2;

import java.util.ArrayList;
import java.util.List;

public class MyNode {

    // Fields:
    private Object value;

    private List<MyNode> children;

    // Constructors:
    public MyNode() {
        children = new ArrayList<>();
    }

    public MyNode(Object value) {
        this.value = value;
        children = new ArrayList<>();
    }

    public MyNode(Object value, List<MyNode> children) {
        this.value = value;
        this.children = children;
    }

    // Getters and setters:
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public List<MyNode> getChildren() {
        return children;
    }

    public void setChildren(List<MyNode> children) {
        this.children = children;
    }


    // Add child node:
    public MyNode joinDeep(MyNode newNode) {
        children.add(newNode);
        return newNode;
    }

    public MyNode joinWide(MyNode newNode) {
        children.add(newNode);
        return this;
    }
}
