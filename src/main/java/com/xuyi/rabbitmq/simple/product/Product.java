package com.xuyi.rabbitmq.simple.product;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.xuyi.rabbitmq.RabbitMQTool;

public class Product {
    public static void main(String[] args) throws Exception{
        Connection connection = RabbitMQTool.getConnect();
        Channel channel = connection.createChannel();

        channel.queueDeclare("queue1",false,false,false,null);
        for(int i=0;i<1000000;i++){
            String message = "Hello World"+i;
            channel.basicPublish("","queue1",null,message.getBytes("UTF-8"));
        }

        channel.close();
        connection.close();
    }
}
