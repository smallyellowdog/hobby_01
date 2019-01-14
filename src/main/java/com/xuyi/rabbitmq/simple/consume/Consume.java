package com.xuyi.rabbitmq.simple.consume;

import com.rabbitmq.client.*;
import com.xuyi.rabbitmq.RabbitMQTool;

import java.io.IOException;

public class Consume {
    public static void main(String[] args) throws Exception{
        Connection connection = RabbitMQTool.getConnect();
        Channel channel = connection.createChannel();

        channel.queueDeclare("queue1",false,false,false,null);

        Consumer consume = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                try {
                    Thread.sleep(5000);
                    System.out.println(message);
                } catch (Exception e) {
                    System.out.println(message+"异常中断");
                    e.printStackTrace();
                } finally {
                    long tag= envelope.getDeliveryTag();
                    channel.basicAck(tag,false);
                }
            }
        };

        String result = channel.basicConsume("queue1",false,consume);

        System.out.println(result);

    }
}
