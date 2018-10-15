package cn.tong.practice;

import java.sql.SQLClientInfoException;

public interface C extends A,B {
    void m() throws ClassCastException;
}
