package mervyn;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * Created by huan.liu on 2016/4/29.
 */

public class Foo implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println("Received message: " + message);
        System.out.println("Text: " + new String(message.getBody()));
    }
}

