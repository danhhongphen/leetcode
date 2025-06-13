package com.leetcode.stack;

import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    private static final List<Character> pushStackSymbolList = List.of('[', '{', '(');
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (pushStackSymbolList.contains(s.charAt(i))) {
                parentheses.push(s.charAt(i));
            }

            if (s.charAt(i) == ']') {
                if (!isOpenCharacter(parentheses, '[')) {
                    return false;
                }
            }
            else if (s.charAt(i) == '}') {
                if (!isOpenCharacter(parentheses, '{')) {
                    return false;
                }
            }
            else if (s.charAt(i) == ')') {
                if (!isOpenCharacter(parentheses, '(')) {
                    return false;
                }
            }
        }

        return parentheses.isEmpty();
    }

    private static boolean isOpenCharacter(Stack<Character> parentheses, Character expectChar) {
        if (parentheses.isEmpty()) {
            return false;
        }
        Character pop = parentheses.pop();
        return pop == expectChar;
    }
}
