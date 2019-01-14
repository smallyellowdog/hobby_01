package com.xuyi.rabbitmq.exchange.consume;

import com.rabbitmq.client.*;
import com.xuyi.rabbitmq.RabbitMQTool;

import java.io.IOException;

public class Consume {
    public static void main(String[] args) throws Exception{
        Connection connection = RabbitMQTool.getConnect();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(RabbitMQTool.EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
        //声明一个临时队列
        String queueName = channel.queueDeclare().getQueue();

        //绑定路由，同一个队列可以绑定多个路由
        channel.queueBind(queueName,RabbitMQTool.EXCHANGE_NAME,RabbitMQTool.ROUTING_KEY_ERROR);

        Consumer consumer = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(message);
            }
        };

        // 接收消息
        channel.basicConsume(queueName, true, consumer);
    }
}
