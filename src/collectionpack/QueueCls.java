package collectionpack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCls {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        while(!queue.isEmpty()){

            System.out.println(queue.poll());
        }

        //FIFO
    }

}
