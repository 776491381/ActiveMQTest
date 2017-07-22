package producer;

import cn.fyypumpkin.jms.jmsspring.prodecer.ProducerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by fyy on 7/21/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:producer.xml")
public class test1 {
    @Autowired
    ProducerService producerService;

    @Test
    public void testProducer() {
        for (int i = 0; i < 100; i++) {
            producerService.sendMessage("text" + i);
        }
    }


}
