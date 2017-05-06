package org.fkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMappingController {

	@RequestMapping(value = "/requestMapping_wuxiao")
	public String register() {
		return "";
	}

}
