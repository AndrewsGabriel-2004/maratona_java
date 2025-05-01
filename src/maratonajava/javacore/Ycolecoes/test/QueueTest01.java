package maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {

        //the first person to join is the same to be treated
        Queue<String> queue = new PriorityQueue<>(); //has to be comparable
        queue.add("D");
        queue.add("B");
        queue.add("E");
        queue.add("A");
        queue.add("C");

        //peek = choose the first element without remove
        //pool = choose the first element removing
        //PriorityQueue keep the order
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
