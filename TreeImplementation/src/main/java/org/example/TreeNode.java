package org.example;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val; // this keyword is for name conflict resolution
        this.left = null;
        this.right = null;
    }

}
