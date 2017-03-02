package com.oasis.android.javabase.list;

import java.util.Stack;

/**
 * @author Oasis Yao
 *         Created on 2017/3/1.
 */

public class StackTest {
    private Stack<String> lists;

    public StackTest(){
        lists = new Stack<String>();
    }

    private   void reset(){
        lists.clear();
        lists.add("1");
        lists.add("2");
        lists.add("3");
        lists.push("4");
    }

    public void testPeek(){
        reset();
        lists.peek();
        System.out.println(lists.toString());
    }

    public void testPop(){
        reset();
        lists.pop();
        System.out.println(lists.toString());
    }
}
