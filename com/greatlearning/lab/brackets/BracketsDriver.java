package com.greatlearning.lab.brackets;

public class BracketsDriver {
    public static void main(String[] args) {
        String [] bracketsList = {
                "([[{}]])",
                "([[{}]]))",
                "(){}[]({[]})",
                "{}()[[]]()",
                "{}()[[]]()["
        };

        for (String brackets : bracketsList) {
            boolean result = BracketBalancer.isBracketsBalanced(brackets);
            if (result)
                System.out.println("\"" + brackets + "\"" + " has Balanced Brackets.");
            else
                System.out.println("\"" + brackets + "\"" + " do not contain Balanced Brackets.");
        }
    }
}
