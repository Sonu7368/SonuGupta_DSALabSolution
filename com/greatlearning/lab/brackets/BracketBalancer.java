package com.greatlearning.lab.brackets;

import java.util.Stack;

public class BracketBalancer {

    public static boolean isBracketsBalanced(String brackets) {
        Stack<Character> characters = new Stack<>();

        for (int i = 0; i < brackets.length(); i++) {
            char bracket = brackets.charAt(i);
            if (isOpenBracket(bracket)) {
                characters.add(bracket);
            }
            else { // bracket is a closing bracket here
                if (characters.isEmpty())   return false;
                if (characters.peek() != getOpenBracketFor(bracket))    return false;
                characters.pop();
            }
        }

        return characters.isEmpty();
    }

    private static boolean isOpenBracket(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private static char getOpenBracketFor(char c) {
        if (c == ')')   return '(';
        if (c == '}')   return '{';
        if (c == ']')   return '[';
        return 0;
    }
}
