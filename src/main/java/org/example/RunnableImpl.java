package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableImpl {

    public static void test(){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        RunnableMessage task = new RunnableMessage();
        Thread thread = new Thread(task);
        thread.start();
        executor.submit(task);
    }

    static class RunnableMessage implements Runnable {
        public void run() {
            System.out.println("Message from a different thread than Main");
        }
    }
}
