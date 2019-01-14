package com.xuyi.rabbitmq;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitMQTool {
    public static String EXCHANGE_NAME = "logs_direct";

    public static String ROUTING_KEY_ERROR = "error";

    public static String ROUTING_KEY_INFO = "info";

    public static Connection getConnect() throws Exception{
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("localhost");
        return connectionFactory.newConnection();
    }
}
