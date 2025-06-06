package com.leetcode.arrays;

import java.util.Stack;

public class ValidParentheses_Ti
{
    /*
        Y tuong:
        - Minh se bo het tat ca nhung cai ({[ (opening bracket) vao cai stack
        - roi neu ma gap dau ngoac dong --> thi minh xem xem truoc no co dau mo cua no chua (order, adjacent)
        - neu ma co (ngay truoc) thi stack.pop() ra
        - neu stack.empty() lay ra het roi --> thi return true

    * */
    public boolean isValid(String s)
    {
        /*
            The second validate case --> is if String s is totally space
        * */
        if (s == null || s.trim().isEmpty() || s.isEmpty())
        {
            return false;
        }
        Stack<Character> myStack = new Stack<>();
        for (Character c : s.toCharArray())
        {
             if (c == '(' || c == '[' || c == '{')
             {
                myStack.push(c);
             }

             else if (c == ')')
             {
                 if (myStack.isEmpty() || myStack.pop() != '(')
                 {
                     return false;
                 }
             }

             else if (c == ']')
             {
                 if (myStack.isEmpty() || myStack.pop() != '[')
                 {
                     return false;
                 }
             }

             else if (c == '}')
             {
                 if (myStack.isEmpty() || myStack.pop() != '{')
                 {
                     return false;
                 }
             }
        }
        if (myStack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }

    }


    public static void main(String []args)
    {
        ValidParentheses_Ti sol = new ValidParentheses_Ti();
        String str1 = "";
        System.out.println("Output for str1: " + sol.isValid(str1)); // return false
        String str2 = "        ";
        System.out.println("Output for str2: " + sol.isValid(str2)); // return false
        String str3 = null;
        System.out.println("Output for str3: " + sol.isValid(str3)); // return false
        String str4 = "()";
        System.out.println("Output for str4: " + sol.isValid(str4)); // return true
        String str5 = "()[]{}";
        System.out.println("Output for str5: " + sol.isValid(str5)); // return true
        String str6 = "(]";
        System.out.println("Output for str6: " + sol.isValid(str6)); // return false
        String str7 = "([])";
        System.out.println("Output for str7: " + sol.isValid(str7)); // return true
    }
}
