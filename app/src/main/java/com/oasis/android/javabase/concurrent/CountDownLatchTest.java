package com.oasis.android.javabase.concurrent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * @author oasis2008
 *         Created on 2017/2/23.
 *
 *         CountDownLatch与cyclicbarrier
 */

public class CountDownLatchTest {
    final static SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final int COUNT_DOWN_COUNT = 2;

    //开启测试
    public static void start() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(COUNT_DOWN_COUNT);
        Worker zhangsan = new Worker("zhangsan",500,countDownLatch);
        Worker lisi = new Worker("lisi",800,countDownLatch);

        zhangsan.start();
        lisi.start();

        countDownLatch.await();//等待COUNT_DOWN_COUNT的数量减为0

        System.out.println("all work done at "+sdf.format(new Date()));
    }

    static class Worker extends Thread{

        private String name;
        private int workTime;
        private CountDownLatch countDownLatch;

        public Worker(String name, int workTime, CountDownLatch countDownLatch) {
            this.name = name;
            this.workTime = workTime;
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            System.out.println("Worker "+name+" do work begin at "+sdf.format(new Date()));
            doWork();//工作了
            System.out.println("Worker "+name+" do work complete at "+sdf.format(new Date()));
            countDownLatch.countDown();//工人完成工作，计数器减一
        }

        private void doWork() {
            try {
                Thread.sleep(workTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
