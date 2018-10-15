package cn.tong.practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UpdDemoReciver {
    public static  void main(String args[]) throws IOException {
        DatagramSocket socket=new DatagramSocket(6000);

        byte[] me=new byte[1024];
        while(true) {
            DatagramPacket packet = new DatagramPacket(me, me.length);
            socket.receive(packet);

            //拆包
            InetAddress address = packet.getAddress();
            String a = new String(packet.getData());
            System.out.print(a);
        }
  //     socket.close();


    }
}
