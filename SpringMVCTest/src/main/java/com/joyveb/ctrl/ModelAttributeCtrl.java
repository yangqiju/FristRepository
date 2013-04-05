package com.joyveb.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**   
 * @Title: SessionCtrl.java 
 * @Package com.joyveb.ctrl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 杨其桔
 * @date 2013-3-22 下午11:50:29 
 * @version V1.0   
 */
@Controller
@RequestMapping("/modelatt")
public class ModelAttributeCtrl{

	/*---------------------------------------------------------*/
	/**
	 * inserMessage方法在 test1方法之前被调用，并且必须输入  /test1?message=..
	 * 
	 
	@ModelAttribute
	public void inserMessage(@RequestParam String message,Model model){
		model.addAttribute("message",message);
	}
	
	@RequestMapping("/test1")
	public String test1(String message){
		return "hello.jsp";
	}
	*/
	/*---------------------------------------------------------*/
	
	@ModelAttribute("message")
	public String inserMessage(@RequestParam String message){
		return message;
	}
	
	@RequestMapping("/test1")
	public String test1(String message){
		return "hello.jsp";
	}
}

