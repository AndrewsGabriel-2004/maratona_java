package maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(); //has to be comparable
        queue.add("D");
        queue.add("B");
        queue.add("E");
        queue.add("A");
        queue.add("C");
        for (String s : queue) {
            System.out.println(s);
        }

    }
}
