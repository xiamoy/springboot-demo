package com.zlt.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.zlt.kafka.sender.KafkaProducer;

@SpringBootApplication
@ComponentScan(value="com.zlt.kafka")
public class SpringKafkaApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringKafkaApplication.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = SpringApplication.run(SpringKafkaApplication.class,args);
		LOGGER.info("get producer from context...");
//		  MessageProducer producer = context.getBean(MessageProducer.class);
//	        while (true){
//	            PayMessage message = new PayMessage();
//	            message.setFee(ToolsUtil.getFee());
//	            message.setOrderCode(ToolsUtil.getNextCode());
//	            message.setSendTime(System.currentTimeMillis());
//	            producer.send(message);
//	            try {
//	                Thread.sleep(2000);
//	            } catch (InterruptedException e) {
//	                e.printStackTrace();
//	            }
//	        }
		
		KafkaProducer kafkaProducer = context.getBean(KafkaProducer.class);
//		kafkaProducer.sendMessage("test start whether send could received by consumer....");
		kafkaProducer.sendMessage("test remove spring boot web whether send could received by consumer....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
