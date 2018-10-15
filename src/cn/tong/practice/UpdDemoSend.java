package cn.tong.practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UpdDemoSend {

    public  static  void main(String args[]) throws IOException {
//       String message="您好,我是周诚";

        Scanner sc=new Scanner(System.in);
       InetAddress address=InetAddress.getByName("192.168.2.58");
     //  System.out.print(address.getAddress());
       while (true){
           String message=sc.nextLine();
           byte me[]=message.getBytes();
           DatagramPacket packet=new DatagramPacket(me,me.length,address,6000);
           DatagramSocket socket=new DatagramSocket();
           socket.send(packet);
       }


      //  socket.close();
    }
}
