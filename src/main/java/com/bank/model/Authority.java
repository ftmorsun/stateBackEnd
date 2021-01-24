package com.bank.model;
/*
 * 
 * Authority is a part of Spring Security Framework
 * to identify users based than their roles 
 * Users can have USER, ADMIN, MANAGER etc authorities to
 * execute on the application. 
 * 
 * Fatma Orsun -Jan 2021
 * */
import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority{
	//unique user id
	private static final long serialVersionUID=1L;
	private final String authority;
	
	//Create an authority object
	public Authority(String authority)
	{
		this.authority=authority;
	}
	
	@Override 
	public String getAuthority() {
		return authority;
	}
	

}
