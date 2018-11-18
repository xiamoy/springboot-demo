package com.zlt.kafka.sender;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.zlt.kafka.common.constant.TopicConst;
import com.zlt.kafka.common.util.ToolsUtil;

@Component
public class KafkaProducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
	
	@Autowired
	private KafkaTemplate kafkaTemplate;
	
	public void sendMessage(String data){
		LOGGER.info("ready to send message: {}",data);
		ProducerRecord<String, String> record = new ProducerRecord<String, String>(TopicConst.PAY_TOPIC,ToolsUtil.getNextCode(), data);
		kafkaTemplate.send(record).addCallback(object->LOGGER.info("succeed to send message:{}",object), e->LOGGER.info("failed to send message:{}",e));
	}
}
