/**  
 * Project Name:RequestMappingTest  
 * File Name:SessionController.java  
 * Package Name:org.fkit.controller  
 * Date:2017年5月7日上午9:59:32  
 * Copyright (c) 2017, 1249082798@qq.com All Rights Reserved.  
 *  
*/  
  
package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.fkit.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**  
 * ClassName:SessionController <br/> 
 * Date:     2017年5月7日 上午9:59:32 <br/>  
 * @author   wuxiao  
 * @version  
 * @see      
 */
@Controller
@SessionAttributes("user")
@RequestMapping(value="sessionAtributes")
public class SessionController {
    private static final Log logger = LogFactory.getLog(SessionController.class);
    
    @RequestMapping(value="/{formName}")
    public String loginForm(@PathVariable String formName){
        logger.info("通过@PathVariable得到的formName为："+formName);
        return formName;
    }
    
    @RequestMapping(value="/sessionLogin")
    public String login(
        @RequestParam("loginName") String loginName,
        @RequestParam("password") String password,
        Model model){
        logger.info("登录");
        
        User user = new User();
        user.setUserName("admin");
        user.setPassword(password);
        user.setLoginName(loginName);
        model.addAttribute("user", user);
        
        return "sessionWelcome";
    }
}
  
