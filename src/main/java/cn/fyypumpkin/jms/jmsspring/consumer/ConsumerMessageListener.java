package cn.fyypumpkin.jms.jmsspring.consumer;


import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * Created by fyy on 7/21/17.
 */


public class ConsumerMessageListener implements MessageListener{
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("received "+textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
