package cn.tong.practice.shangwang;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Shangwangzhe implements Delayed {
    private String name;
    private Integer  netCost;
    private Long  endTime;




    @Override
    public long getDelay(TimeUnit unit) {

        return 0;
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNetCost() {
        return netCost;
    }

    public void setNetCost(Integer netCost) {
        this.netCost = netCost;
    }
}
