package cn.fyypumpkin.jms.queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by fyy on 7/19/17.
 */
public class AppProducer {

    private static final String url = "tcp://123.206.101.70:61616";
    private static final String queueName = "queue-test";

    public static void main(String[] args) throws JMSException {
        //1.创建连接工厂
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        //2.创建Connection
        Connection connection = connectionFactory.createConnection();

        //3.启动连接
        connection.start();
        //4.创建回话
        /**
         * para1,是否启用事务
         * para2.应答模式
         */
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        //5.创建一个目标
        Destination destination = session.createQueue(queueName);

        //6.创建一个生产者

        MessageProducer producer = session.createProducer(destination);

        for (int i = 0; i < 100; i++) {
            //7.创建消息
            TextMessage textMessage = session.createTextMessage("test  " + i);
            producer.send(textMessage);
            System.out.println("send success  " + textMessage.getText());
        }


        //9.连接关闭
        connection.close();
    }


}
