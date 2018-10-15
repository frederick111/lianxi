package cn.tong.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClientDemo {

    public static void main(String args[]) throws IOException {
        Socket socket=new Socket("localhost",6000);

        OutputStream out = socket.getOutputStream();
        String  message="周诚是傻吊";
        byte me[]=message.getBytes();
        out.write(me,0,me.length);

        InputStream in = socket.getInputStream();
        byte re[]= new byte[1024];
        int len=in.read(re);
        System.out.print(new String(re,0,len));


    socket.close();
    }
}
