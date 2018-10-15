package cn.tong.practice;

import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class MoniQueue {

    private LinkedList list;

    private AtomicInteger size;

    public MoniQueue(LinkedList list, AtomicInteger size) {
        this.list = list;
        this.size = size;
    }


    public  void  put(Object obj,Object lock) throws InterruptedException {
        synchronized (lock) {
//            while (this.list.size() > size) {
//                lock.wait();
//            }
//                this.list.add(obj);
//                lock.notify();
//
       }
    }

    }



