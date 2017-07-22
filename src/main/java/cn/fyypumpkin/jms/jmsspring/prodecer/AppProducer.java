package cn.fyypumpkin.jms.jmsspring.prodecer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by fyy on 7/21/17.
 */
//@ContextConfiguration("classpath:producer.xml")
public class AppProducer {

//    @Autowired
//    private  ProducerService producerService;
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            AppProducer appProducer = new AppProducer();
//            appProducer.producerService.sendMessage("text2 " + i);
//        }
//    }


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        for(int i = 0;i<100;i++){
            service.sendMessage("text2 "+i);
        }
        context.close();
    }

}
