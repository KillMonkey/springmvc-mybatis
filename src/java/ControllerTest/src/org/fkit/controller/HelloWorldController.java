package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	private static final Log logger = LogFactory.getLog(HelloWorldController.class);
	
	@RequestMapping(value="/hello")
	public String helloWorldController(Model model){
		logger.info("HelloWorldController被调用啦");
		model.addAttribute("message", "Hello World From ControllerTest");
		return "helloWorld";
	}
}
