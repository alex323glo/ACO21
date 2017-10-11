package ua.artcode.week6.day2_io.design_patterns.decorator;

public class ActionNode {

    private String value;

    private ActionNode next;

    public ActionNode() {
    }

    public ActionNode(String value, ActionNode next) {
        this.value = value;
        this.next = next;
    }

    public String action() {
        return next != null ? next.action() + "->" + value : value;
    }

}
