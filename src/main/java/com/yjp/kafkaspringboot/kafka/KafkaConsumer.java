package com.yjp.kafkaspringboot.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);


    @KafkaListener(topics = "flink-sql-message")
    public void listen(ConsumerRecord<String, String> record) throws Exception {
        System.out.println(record.value());
    }

}

