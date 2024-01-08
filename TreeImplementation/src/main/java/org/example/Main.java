package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BinarySearchTree bstOne = new BinarySearchTree();
        bstOne.addNodeBST(100);
        bstOne.addNodeBST(5);
        bstOne.addNodeBST(6);
        bstOne.addNodeBST(1);
        bstOne.addNodeBST(2);

//        bstOne.printInOrder();

        bstOne.printLevelOrderTraversal();

    }
}