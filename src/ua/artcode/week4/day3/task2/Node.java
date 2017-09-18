package ua.artcode.week4.day3.task2;

import java.util.ArrayList;
import java.util.List;

public class Node {

    // Fields:
    private Object value;

    private List<Node> children;

    // Constructors:
    public Node() {
        children = new ArrayList<>();
    }

    public Node(Object value) {
        this.value = value;
        children = new ArrayList<>();
    }

    public Node(Object value, List<Node> children) {
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

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }


    // Add child node:
    public Node joinDeep(Node newNode) {
        children.add(newNode);
        return newNode;
    }

    public Node joinWide(Node newNode) {
        children.add(newNode);
        return this;
    }
}
