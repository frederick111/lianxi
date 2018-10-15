package cn.tong.practice;

import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.util.*;

public class Test {

    public static  void main (String args[]){
            Object obj=new Object();
           new Thread(new Choujiang(obj,"线程1")).start();
           new Thread(new Choujiang(obj,"线程2")).start();


        ArrayList<String> a1=new ArrayList<>();
        a1.add("111");
        HashSet<Integer> a2=new HashSet<>();
        LinkedList

    }

    public static void iterator(Collection c){
        Iterator iterator = c.iterator();

        while (iterator.hasNext()){

            iterator.next();
        }


    }
}
