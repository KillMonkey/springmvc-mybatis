/**  
 * Project Name:RequestMappingTest  
 * File Name:DataBindingController.java  
 * Package Name:org.fkit.controller  
 * Date:2017年5月6日下午11:05:47  
 * Copyright (c) 2017, 1249082798@qq.com All Rights Reserved.  
 *  
*/

package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * ClassName:DataBindingController <br/>
 * Date: 2017年5月6日 下午11:05:47 <br/>
 * 
 * @author wuxiao
 * @version
 * @see
 */
@Controller
public class DataBindingController {
    
    private static final Log logger = LogFactory.getLog(DataBindingController.class);
    
    @RequestMapping(value="/pathVariableTest/{userId}")
    public String pathVariableTest(@PathVariable Integer userId)
    {
        logger.info("通过@PathVariable得到的数据是："+ userId);
        return "index";
    }
    
    @RequestMapping(value="/requestHeaderTest")
    public String requestHeaderTest(
        @RequestHeader("User-Agent") String userAgent,
        @RequestHeader(value="Accept") String[] accepts)
    {
        logger.info("通过@RequestHeader得到的User-Agent数据是："+ userAgent);
        logger.info("通过@RequestHeader得到的Accept数据开始打印了*************");
        for(String string:accepts)
        {
            logger.info(string);
        }
        logger.info("通过@RequestHeader得到的Accept数据结束打印了*************");
        return "index";
    }
    
    @RequestMapping(value="/cookieValueTest")
    public String cookieValueTest(@CookieValue(value="JSESSIONID",defaultValue="") String sessionId)
    {
        logger.info("通过@CookieValue得到的数据是："+ sessionId);
        return "index";
    }
}
