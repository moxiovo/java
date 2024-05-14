package com.fengtaisec.d3_collection_list;

import java.util.LinkedList;

public class LinkTest3 {
    public static void main(String[] args) {
        // 创建一个队列
        LinkedList<String> queue = new LinkedList<>();
        // 不要用多态写 是因为LinkedList 对象
        queue.addLast("第1号人");
        queue.addLast("第2号人");
        queue.addLast("第3号人");
        queue.addLast("第4号人");
        System.out.println(queue);
        // 出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        System.out.println("-----------------------------------------------------------");
        // 创建一个栈对象
        LinkedList<String> stack = new LinkedList<>();
        // 压栈 push
        stack.push("第1颗子弹");
        stack.push("第2颗子弹");
        stack.push("第3颗子弹");
        stack.push("第4颗子弹");
        System.out.println(stack);
        // 出栈 pop
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
