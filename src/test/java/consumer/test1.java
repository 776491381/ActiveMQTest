package consumer;

import cn.fyypumpkin.jms.jmsspring.consumer.ConsumerMessageListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * Created by fyy on 7/21/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class test1 {

    @Autowired
    ConsumerMessageListener consumerMessageListener;

    @Test
    public void test(){
        new ClassPathXmlApplicationContext("classpath:consumer.xml");

    }


}
