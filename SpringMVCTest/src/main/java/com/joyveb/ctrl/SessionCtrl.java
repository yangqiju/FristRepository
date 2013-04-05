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
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author �����
 * @date 2013-3-23 ����12:25:13
 * @version V1.0
 */
@Controller
@RequestMapping("/sessionctl")
@SessionAttributes("admin_user")
public class SessionCtrl {

	/**
	 * ��userע��session��
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
	 * SpringMVC �ͻ��Զ��� @SessionAttributes ���������ע�뵽 ModelMap ����
	 */
	@RequestMapping("/test1")
	@ResponseBody
	public User test1(@ModelAttribute("admin_user") User user) {
		return user;
	}
}
