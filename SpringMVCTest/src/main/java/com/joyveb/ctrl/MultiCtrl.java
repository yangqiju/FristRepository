package com.joyveb.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.joyveb.bean.User;

/**
 * 
 * ��Ŀ���ƣ�SpringMVCTest �����ƣ�RestfulCtrl
 * 
 * @Company: �������������޹�˾
 * @Copyright: Copyright (c) 2012
 * @Author�� ����� ����ʱ�䣺2013-1-2 ����10:12:16 �޸ı�ע��
 * @version
 * 
 */
@Controller
@RequestMapping("/multi")
public class MultiCtrl {
	//<!-- ͬһ��Դ,���ֱ���-->
	
	

	@RequestMapping("/user")
	@ResponseBody
	// ����@ResponseBody������������
	public User tset1() {
		User user = new User();
		user.setUserName("usernaem");
		user.setPassword("password");
		return user;
	}

	@RequestMapping("/user.json")
	public User test() {
		User user = new User();
		user.setUserName("usernaem");
		user.setPassword("password");
		return user;
	}
	
	@RequestMapping("/user.html")
	public ModelAndView tset4() {
		ModelAndView mav = new ModelAndView("hello.jsp");
		mav.addObject("message", "user.html");
		return mav;
	}
	
	@RequestMapping("/user.xml")
	public ModelAndView tset5() {
		ModelAndView mav = new ModelAndView("xmlView");
		User user =new User();
		user.setPassword("abc");
		user.setUserName("user");
		mav.addObject("user", user);
		return mav;
	}
	
}
