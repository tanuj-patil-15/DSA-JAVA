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

    int height(){
        return height(this.bstRoot);
    }

    int height(TreeNode root)
    {
        if (root == null)
            return 0;
        else {

            // Compute  height of each subtree
            int lheight = height(root.left);
            int rheight = height(root.right);

            // use the larger one
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }


    public void printLevelOrderTraversal()
    {
        printLevelOrderTraversal(this.bstRoot);
    }

    public void printLevelOrderTraversal(TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root); // adding first node
        q.add(null); // adding null as a delimiter so that we know when to start new level

        while(!q.isEmpty())
        {
            TreeNode curr = q.poll();

            if(curr == null)
            {
                if(!q.isEmpty())
                {
                    q.add(null); // add null as we have completely traversed next level in the queue
                    System.out.println(); // println so that it will print new level on new line
                }
            }
            else
            {
                // Pushing left child current node
                if (curr.left != null)
                {
                    q.add(curr.left);
                }

                // Pushing right child current node
                if (curr.right != null)
                    q.add(curr.right);

                System.out.print(curr.val + " ");
            }
        }

    }

//    public void searchBST(int val)
//    {
//        searchBST(this.bstRoot,val);
//    }

//    boolean searchBST(TreeNode root, int val)
//    {
//        if(root.val == val)
//            return true;
//        else if (root.val > val)
//        {
//            searchBST(this.bstRoot,val);
//        }
//        else if (root.val < val)
//        {
//            searchBST(this)
//        }
//
//    }

}
