package com.lby.springcloudmq.QueueConfig;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: TSF
 * @Description:
 * @Date: Create in 2018/12/5 11:06
 */
@Configuration
public class QueueConfig {
    /**
     * 创建消息队列
     * @return
     */
    @Bean
    public Queue createQueue() {
        return new Queue("hello-queue");
    }
}
