package org.fkit.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


/**
 * ClassName: User <br/>
 * date: 2017年5月6日 下午9:55:29 <br/>
 * 
 * @author wuxiao
 */
public class User implements Serializable {
    
    @Getter
    @Setter
    private String loginName = "";
    
    @Getter
    @Setter
    private String password = "";
    
    @Getter
    @Setter
    private String userName = "";
    
}
