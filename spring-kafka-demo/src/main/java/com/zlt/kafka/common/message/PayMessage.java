package com.zlt.kafka.common.message;

import lombok.Data;


@Data
public class PayMessage {
    private String orderCode;
    private Float fee;
    private Long sendTime;
	
    /*public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public Float getFee() {
		return fee;
	}
	public void setFee(Float fee) {
		this.fee = fee;
	}
	public Long getSendTime() {
		return sendTime;
	}
	public void setSendTime(Long sendTime) {
		this.sendTime = sendTime;
	}*/
    
    
    
}
