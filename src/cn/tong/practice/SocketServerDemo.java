package cn.tong.practice;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerDemo {

    public static void main(String args[]) throws IOException {
        ServerSocket serverSocket=new ServerSocket(6000);

        while(true){
            Socket socket= serverSocket.accept();
           new Thread(new SendMessage(socket)).start();

        }







    }
}
