package com.zlt.kafka.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zlt.kafka.common.constant.TopicConst;
import com.zlt.kafka.common.message.PayMessage;


//@Service
public class MessageConsumer {
    private static Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
    private Gson gson = new GsonBuilder().create();

//    @KafkaListener(topics = TopicConst.PAY_TOPIC)
    public void onMessage(String payMessage) {
//        PayMessage msg = gson.fromJson(payMessage, PayMessage.class);
//        logger.info("MessageConsumer: onMessage: message is: [" + msg + "]");
    }
}