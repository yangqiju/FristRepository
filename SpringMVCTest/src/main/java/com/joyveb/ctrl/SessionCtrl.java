package com.joyveb.ctrl;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.joyveb.bean.User;

/**
 * @Title: SessionCtrl.java
 * @Package com.joyveb.ctrl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author 杨其桔
 * @date 2013-3-23 上午12:25:13
 * @version V1.0
 */
@Controller
@RequestMapping("/sessionctl")
@SessionAttributes("admin_user")
public class SessionCtrl {

	/**
	 * 把user注入session中
	 */
	@RequestMapping("/init")
	@ResponseBody
	public String init(HttpSession session) {
		User u = new User();
		u.setPassword("123");
		u.setUserName("admin");
		session.setAttribute("admin_user", u);
		return "init";
	}

	/**
	 * SpringMVC 就会自动将 @SessionAttributes 定义的属性注入到 ModelMap 对象，
	 */
	@RequestMapping("/test1")
	@ResponseBody
	public User test1(@ModelAttribute("admin_user") User user) {
		return user;
	}
}
