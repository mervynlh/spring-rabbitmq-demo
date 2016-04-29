package mervyn;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huan.liu on 2016/4/29.
 */
public class SpringTest {
    public static void main(final String... args) throws Exception {

        AbstractApplicationContext ctx =
                new ClassPathXmlApplicationContext("context.xml");
        RabbitTemplate template = ctx.getBean(RabbitTemplate.class);
        User user = new User();
        user.setPassword("abcdedf");
        user.setUsername("mervyn");
        template.convertAndSend(user);
        Thread.sleep(1000);
        ctx.destroy();
    }
}
