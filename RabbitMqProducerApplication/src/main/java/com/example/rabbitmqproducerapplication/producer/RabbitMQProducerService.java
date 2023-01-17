package com.example.rabbitmqproducerapplication.producer;

public interface RabbitMQProducerService {

    void sendMessage(String message, String routingKey);
}
