/**
 * 
 */
package com.ssm.service;

import com.ssm.pojo.User;

/**
 * @author 作者
 * @data 2019年8月6日 
 */
public interface KafkaService {
	/**
	 * 发送一个消息队列
	 * */
	void sendMessage(User user);
}
