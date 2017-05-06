package org.fkit.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

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
