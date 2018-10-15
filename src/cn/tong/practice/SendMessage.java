package cn.tong.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SendMessage  implements  Runnable{
    private  Socket socket;

    public  SendMessage(Socket socket){
    this.socket=socket;
    }

    @Override
    public void run() {
        try {
            InputStream in= socket.getInputStream();
            byte re[]= new byte[1024];
            int len=in.read(re);
            System.out.print(new String(re,0,len));

            OutputStream outputStream = this.socket.getOutputStream();
            byte bi[]="服务器收到".getBytes();
            outputStream.write(bi);
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
