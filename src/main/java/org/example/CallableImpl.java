package org.example;

import java.util.concurrent.*;

public class CallableImpl {

    public static void test() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CallableMessage task = new CallableMessage();
        Future<String> message = executor.submit(task);
        try {
            System.out.println(message.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    private static class CallableMessage implements Callable<String> {
        public String call() throws Exception{
            return "Test 123";
        }
    }
}
