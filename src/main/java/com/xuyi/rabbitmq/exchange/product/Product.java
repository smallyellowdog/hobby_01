package com.xuyi.rabbitmq.exchange.product;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.xuyi.rabbitmq.RabbitMQTool;

/**
 * exchange
 */
public class Product {
    public static void main(String[] args) throws Exception{
        Connection connection = RabbitMQTool.getConnect();
        Channel channel = connection.createChannel();

        //direct topic headers fanout

        channel.exchangeDeclare(RabbitMQTool.EXCHANGE_NAME, BuiltinExchangeType.DIRECT);

        channel.basicPublish(RabbitMQTool.EXCHANGE_NAME,RabbitMQTool.ROUTING_KEY_ERROR,null,"错误日志".getBytes("UTF-8"));

        channel.basicPublish(RabbitMQTool.EXCHANGE_NAME,RabbitMQTool.ROUTING_KEY_INFO,null,"信息日志".getBytes("UTF-8"));

        channel.close();
        connection.close();
    }
}

