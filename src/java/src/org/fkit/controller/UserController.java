package org.fkit.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	/**
	 *  保存用户列表
	 */
	private static List<User> userLst = new ArrayList<User>();
	
	/**
	 * 日志
	 */
	private static final Log logger = LogFactory.getLog(UserController.class);
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String registerForm(){
		logger.info("register GET方法被调用");
		//跳转至注册界面
		return "registerForm";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(
			@RequestParam("loginName") String loginName,
			@RequestParam("password") String password,
			@RequestParam("userName") String userName){
		logger.info("register POST方法被调用");
		
		User user = new User();
		user.setLoginName(loginName);
		user.setPassword(password);
		user.setUserName(userName);
		userLst.add(user);
		
		return "loginForm";
	}
	
	@RequestMapping(value="login")
	public String login(
			@RequestParam("loginName") String loginName,
			@RequestParam("password") String password,
			Model model){
		logger.info("登录名: "+loginName+" 密码: "+password);
		for(User user:userLst)
		{
			if(user.getLoginName().equals(loginName) && user.getPassword().equals(password))
			{
				model.addAttribute("user",user);
				return "welcome";
			}
		}
		return "loginForm";
	}
}
