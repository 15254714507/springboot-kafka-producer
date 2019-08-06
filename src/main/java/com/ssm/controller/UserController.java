/**
 * 
 */
package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ssm.pojo.User;
import com.ssm.service.KafkaService;

/**
 * @author 作者
 * @data 2019年8月1日 
 */
@Controller
public class UserController {
		@Autowired
		KafkaService kafkaService;
		
		@RequestMapping("findAll")
		public String findAll(Model model) throws Exception {					
			User user = new User();
			user.setUser_id("111");
			user.setName("搞笑");
			user.setAge(5);							
			kafkaService.sendMessage(user);
												
			return "index";			
		}
}
