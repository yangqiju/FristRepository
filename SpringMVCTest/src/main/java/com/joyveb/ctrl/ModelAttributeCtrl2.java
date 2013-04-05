package com.joyveb.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.joyveb.bean.User;

/**
 * @Title: ModelAttributeCtrl2.java
 * @Package com.joyveb.ctrl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author 杨其桔
 * @date 2013-3-23 上午12:07:18
 * @version V1.0
 */
@Controller
@RequestMapping("/modelatt2")
public class ModelAttributeCtrl2 {

	@ModelAttribute("user")
	public User addAccount() {
		User user = new User();
		user.setUserName("user");
		user.setPassword("password");
		return user;
	}

	@RequestMapping(value = "/test1")
	@ResponseBody
	public User test1(@ModelAttribute("user") User user) {
		user.setUserName("juzi");
		return user;
	}
}
