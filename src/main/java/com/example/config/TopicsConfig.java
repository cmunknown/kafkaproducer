package com.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicsConfig {

    @Bean
    public NewTopic myTopicDto() {
        return TopicBuilder.name("dto").build();
    }

    @Bean
    public NewTopic myTopicString() {
        return TopicBuilder.name("string").build();
    }

    @Bean
    public NewTopic myTopicStringIBM() {
        return TopicBuilder.name("stringibm").build();
    }
}