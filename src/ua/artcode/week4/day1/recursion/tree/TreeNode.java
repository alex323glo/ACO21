package ua.artcode.week4.day1.recursion.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

    private int amount;
    List<TreeNode> slaves;

    public TreeNode() {
        slaves = new ArrayList<>();
    }

    public TreeNode(int amount) {
        slaves = new ArrayList<>();
        this.amount = amount;
    }

    public TreeNode(int amount, List<TreeNode> slaves) {
        this.amount = amount;
        this.slaves = slaves;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<TreeNode> getSlaves() {
        return slaves;
    }

    public void setSlaves(List<TreeNode> slaves) {
        this.slaves = slaves;
    }

}
