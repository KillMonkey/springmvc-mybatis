/**  
 * Project Name:RequestMappingTest  
 * File Name:FormController.java  
 * Package Name:org.fkit.controller  
 * Date:2017年5月7日下午10:28:26  
 * Copyright (c) 2017, 1249082798@qq.com All Rights Reserved.  
 *  
*/  
  
package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
 * ClassName:FormController <br/> 
 * Date:     2017年5月7日 下午10:28:26 <br/>  
 * @author   wuxiao  
 * @version  
 * @see      
 */
@Controller
@RequestMapping(value="Model")
public class FormController {
    
    private static final Log logger = LogFactory.getLog(FormController.class);
    
    @RequestMapping(value="/{formName}")
    public String loginForm(@PathVariable String formName){
        logger.info("跳转至："+formName);
        return formName;
    }
}
  
