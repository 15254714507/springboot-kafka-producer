/**
 * 
 */
package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.alibaba.fastjson.JSONObject;
import com.ssm.pojo.User;
import com.ssm.service.KafkaService;

/**
 * @author 作者
 * @data 2019年8月6日 
 */
public class KafkaServiceImpl implements KafkaService{
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	@Override
	public void sendMessage(User user) {
		kafkaTemplate.send("my-replicated-topic", JSONObject.toJSONString(user));
		
	}

}
