package com.ling.springboot02.message;


import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

@Service
public class LinkedBlockQueue_message {

    @PostConstruct
    public void startExecutor() {
        System.out.println("线程池开启运行。。。。。");
        executorStart.execute(() -> escExecute());
    }

    private static Executor executorStart = Executors.newFixedThreadPool(3);

    public static LinkedBlockingQueue<String> esqQueue = new LinkedBlockingQueue<>(5000);

    public void escExecute(){
        try{
            while (true) {
                System.out.println("等待消息消费");
                String take = esqQueue.take();
                System.out.println("消费一条消息：" + take);
            }
        } catch (InterruptedException e) {

        }
    }

    public void addMessage(String message) {
        try{
            esqQueue.put(message);
            System.out.println("发一条消息:" + message);
        } catch (InterruptedException e) {

        }
    }

}
