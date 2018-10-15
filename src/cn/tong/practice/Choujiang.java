package cn.tong.practice;

public class Choujiang implements  Runnable {
   private  Integer num=0;
   private  String name;
   private  Object object;


    public Choujiang(String name) {
        this.name = name;
    }

    public Choujiang(Object object,String name) {
        this.object = object;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            synchronized (object) {// 这个很重要，必须使用一个锁
                int start = 1;
                while (num<76) {
                    num++;
                    System.out.println(this.name + ":" + num);
                    if (start==5) {
                       wait();
                    }
                    start++;
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
