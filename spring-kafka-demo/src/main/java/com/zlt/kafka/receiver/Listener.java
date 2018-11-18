package com.zlt.kafka.receiver;

import java.util.Optional;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import com.zlt.kafka.common.constant.TopicConst;

public class Listener {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	 
	 @KafkaListener(topics = {TopicConst.PAY_TOPIC})
	 public void listen(ConsumerRecord<?, ?> record) {
		 Optional<?> optionalRecord = Optional.ofNullable(record);
		 if (optionalRecord.isPresent()) {			
			 logger.info("received key: " + record.key()+"kafka的value: " + record.value().toString());
		}else{
			logger.info("record :{} is not present");
		}
	 }

}
