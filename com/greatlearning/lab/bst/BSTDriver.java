package com.greatlearning.lab.bst;

public class BSTDriver {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(40);
        bst.insert(20);
        bst.insert(60);
        bst.insert(10);
        bst.insert(30);
        bst.insert(50);
        bst.insert(70);

        System.out.println("A BST is made with inserting 40, 20, 60, 10, 30, 50 & 70. \n");

        bst.findPairWithSum(130);
        bst.findPairWithSum(30);
        bst.findPairWithSum(40);
        bst.findPairWithSum(90);
        bst.findPairWithSum(100);
        bst.findPairWithSum(10);
        bst.findPairWithSum(20);
        bst.findPairWithSum(55);
    }


}
