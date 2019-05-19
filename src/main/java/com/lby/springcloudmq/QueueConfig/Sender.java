package com.lby.springcloudmq.QueueConfig;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: TSF
 * @Description:
 * @Date: Create in 2018/12/5 11:09
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;
    /**
     * 发送消息的方法
     *
     * @param msg
     */
    public void send(String msg) {
        //向消息队列发送消息
        amqpTemplate.convertAndSend("hello-queue", msg);
    }
}
