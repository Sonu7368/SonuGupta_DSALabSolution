package com.greatlearning.lab.bst;

import java.util.ArrayList;

public class BST {
    Node root;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Node temp = root;

        while (true) {
            if (data > temp.data) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return;
                }
                else temp = temp.right;
            }
            else {
                if (temp.left == null) {
                    temp.left = newNode;
                    return;
                }
                else temp = temp.left;
            }
        }
    }

    public ArrayList<Integer> toListInOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        toListInOrder(list, root);
        return list;
    }

    private void toListInOrder(ArrayList<Integer> list, Node node) {
        if (node == null)   return;

        toListInOrder(list, node.left);
        list.add(node.data);
        toListInOrder(list, node.right);
    }

    public void findPairWithSum(int sum) {
        findPairWithSum(sum, this.toListInOrder());
    }

    private void findPairWithSum(int sum, ArrayList<Integer> list) {
        int start = 0, end = list.size() - 1;

        while (start < end) {
            int currSum = list.get(start) + list.get(end);
            if (currSum == sum) {
                System.out.printf("Pair with sum %d is %d & %d. \n", sum, list.get(start), list.get(end));
                return;
            }

            if (currSum < sum)   start++;
            else end--;
        }

        System.out.printf("Nodes are not found with sum %d. \n", sum);
    }

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}




