package com.example.Project.messaging.producer;


import com.example.Project.config.RabbitMQConfig;
import com.example.Project.model.entity.Customer;
import com.example.Project.service.CustomerService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/messaging/publish")
public class CustomerProducer {
    @Autowired
    private RabbitTemplate template;

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer/{id}")
    public void sendCreditAppliation(@PathVariable int id) {
        Customer customer = customerService.getCustomerById(id);
        template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, customer);

    }
}