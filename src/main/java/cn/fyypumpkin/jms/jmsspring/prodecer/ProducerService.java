package cn.fyypumpkin.jms.jmsspring.prodecer;

import org.springframework.stereotype.Service;

/**
 * Created by fyy on 7/21/17.
 */


public interface ProducerService {

    void sendMessage(String message);


}
