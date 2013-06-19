package com.panlj.system.domain;

import java.io.Serializable;


public class UserSession implements Serializable{

	private static final long serialVersionUID = -5334980797651496255L;
	
	
	private Long id;
	
	private String name;
	
	private String username;
	
	public UserSession (){
		
	}
	
	public UserSession (String name){
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
