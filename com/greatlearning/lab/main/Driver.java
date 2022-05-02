package com.greatlearning.lab.main;

import com.greatlearning.lab.brackets.BracketsDriver;
import com.greatlearning.lab.bst.BSTDriver;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Q1. Brackets Balancer \n");
        BracketsDriver.main(args);

        System.out.println("\n_______________\n");

        System.out.println("Q2. Find Sum Pair in BST");
        BSTDriver.main(args);

    }
}
