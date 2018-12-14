package swordmeansoffer;

import java.util.Stack;

/**
 * 用两个栈实现一个队列
 */
public class Solution8 {

        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() {

            if(stack1.empty()&&stack2.empty()){
                throw new RuntimeException("Queue is empty!");
            }
            if(stack2.empty()){
                while(!stack1.empty()){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

}
