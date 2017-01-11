/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Minnn
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Quang");
        queue.add("Hai");
        queue.addFirst("Ha");
        queue.addLast("Kien");
        System.out.println(queue);
        for(String val: queue){
            System.out.println(val);
        }
        System.out.println("Peek: " + queue.peek());
        System.out.println("After Peek: " + queue);
        String poll = queue.poll();
        System.out.println("Poll: " + poll);
        System.out.println("After Poll: " + queue);
        System.out.println("LastPoll: " + queue.pollLast());
        System.out.println("After PollLast" + queue);
    }
}
