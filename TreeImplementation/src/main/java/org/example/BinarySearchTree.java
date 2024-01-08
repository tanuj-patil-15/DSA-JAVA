package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree
{
    TreeNode bstRoot;
    public BinarySearchTree()
    {
        bstRoot = null;
    }
    public void addNodeBST(int val)
    {
        this.bstRoot = addNodeBST(this.bstRoot, val);
    }


    public TreeNode addNodeBST(TreeNode root, int val)
    {
        TreeNode newNode = new TreeNode(val);
        if (this.bstRoot == null)
        {
            this.bstRoot = newNode;
            return this.bstRoot;
        }

        if(root == null)
        {
            return newNode;
        }

        if (root.val < val)
        {
            root.right = addNodeBST(root.right, val);
        } else {
            root.left = addNodeBST(root.left, val);
        }

        return root;
    }

    public void printInOrder()
    {
        printInOrder(this.bstRoot);
    }

    public void printInOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        printInOrder(root.left);
        System.out.println(root.val+" ");
        printInOrder(root.right);
    }


    public void printLevelOrderTraversal()
    {
        printInOrder(this.bstRoot);
    }
    Queue<Integer> queueLevelOrder = new LinkedList<>();
    public void printLevelOrderTraversal(TreeNode root)
    {
//        Queue<Integer> queue = new LinkedList<>();

        if(root == null)
        {
            return;
        }
        queueLevelOrder.add(root.val);
        printLevelOrderTraversal(root.left);
        printLevelOrderTraversal(root.right);

        System.out.println(queueLevelOrder);


    }

    public void searchBST(int val)
    {
        searchBST(this.bstRoot,val);
    }

    boolean searchBST(TreeNode root, int val)
    {
        if(root.val == val)
            return true;
        else if (root.val > val)
        {
            searchBST(this.bstRoot,val);
        }
        else if (root.val < val)
        {
            searchBST(this)
        }

    }

}
