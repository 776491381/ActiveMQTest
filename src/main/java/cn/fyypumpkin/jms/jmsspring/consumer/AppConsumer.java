package cn.fyypumpkin.jms.jmsspring.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fyy on 7/21/17.
 */
public class AppConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");

    }

}
