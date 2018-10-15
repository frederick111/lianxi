package cn.tong.practice.shangwang;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class Consumer {

    public static void main(String args[]) throws  Exception{

        ConnectionFactory factory=new ActiveMQConnectionFactory();

        Connection connection = factory.createConnection();

        connection.start();

        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);

        Queue test = session.createQueue("hha");

        MessageConsumer consumer = session.createConsumer(test);

        while (true){
            TextMessage msg=(TextMessage) consumer.receive(5000);

            if(msg!=null) {
                System.out.print(msg.getText());
            }else{

                break;
            }

        }


    }
}
