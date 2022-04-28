package com.example.controller;

import com.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class ProducerController {

    @Autowired
    private KafkaTemplate<String, Person> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplateString;

    @PostMapping(value = "/producer")
    public String sendDto(@RequestBody Person user) {
        kafkaTemplate.send("dto", user);
        System.out.println("ok");
        return "KAFKA: Message sent Successfully to the topic";
    }

    @PostMapping(value = "/producer/{message}")
    public String sendMessage(@PathVariable String message) {
        kafkaTemplateString.send("string", message);
        System.out.println("ok");
        return "KAFKA: Message sent Successfully to the topic";
    }
}
