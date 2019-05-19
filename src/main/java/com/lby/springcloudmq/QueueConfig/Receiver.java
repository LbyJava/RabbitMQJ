package com.lby.springcloudmq.QueueConfig;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: TSF
 * @Description:
 * @Date: Create in 2018/12/5 11:18
 */
@Component
public class Receiver {

    @RabbitListener(queues = "hello-queue")
    public void process(String msg) {
        System.out.println("msg = " + msg);
    }
}
