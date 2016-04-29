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
        template.convertAndSend("Hello, world11!");
        FooTest bean = ctx.getBean(FooTest.class);
        bean.testListen("aaa");
        Thread.sleep(1000);
        ctx.destroy();
    }
}
