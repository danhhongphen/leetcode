package com.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>() ;
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');

        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()) {
                    return false;

                }
                if (stack.peek() != null && map.get(stack.peek()) != s.charAt(i)) {
                    return false;
                } else {
                        stack.pop();
                }

            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "[";
        System.out.println(isValid(s));
    }
}
