package ProducerConsumer;

import java.util.Random;

public class Consumer implements Runnable {
    private Drop drop;

    public Consumer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        for (int message = drop.take();
             ! (message==1111111);
             message = drop.take()) {
            System.out.format("MESSAGE RECEIVED: %s%n", message);
//            try {
//                Thread.sleep(random.nextInt(5000));
//            } catch (InterruptedException e) {}
        }
    }
}
