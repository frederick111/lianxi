package cn.tong.practice.shangwang;

import java.util.concurrent.DelayQueue;

public class Netbar  implements  Runnable{

    private DelayQueue<Shangwangzhe>  queue=new DelayQueue();




    @Override
    public void run() {

    }


    public void shangwang(Shangwangzhe shangwangzhe){
        queue.add(shangwangzhe);
        System.out.print(shangwangzhe.getName()+"开始上网,时长："+shangwangzhe.getNetCost()*3600);
    }


    public void xiajia() throws InterruptedException {
         Shangwangzhe shangwangzhe= queue.take();
        System.out.print(shangwangzhe.getName()+"下机");



    }




}
