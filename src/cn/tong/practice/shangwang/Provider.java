package cn.tong.practice.shangwang;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class Provider {

  public static void main(String args[]) throws Exception{
      ConnectionFactory   connectionFactory=new ActiveMQConnectionFactory();

      Connection connection = connectionFactory.createConnection();

      Session session =connection.createSession(true,Session.AUTO_ACKNOWLEDGE);

      Queue queue = session.createQueue("hha");

      MessageProducer producer = session.createProducer(queue);


      for (int i=0; i<10;i++){

          Message msg=session.createTextMessage("哈哈哈"+i);
          producer.send(msg);

      }

      session.commit();
      connection.close();
  }

}
