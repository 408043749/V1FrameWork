package com.panlj.system.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="Sys_Resource")
public class Resource extends AbstractTree<Resource> implements Serializable{

	private static final long serialVersionUID = -5334980797651496255L;
	
	/**
	 * EXTJS中的控制器（URL）,菜单地址
	 */
	private String url;
	
	/**
	 * EXTJS中的控制器
	 */
	private String controller;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getController() {
		return controller;
	}

	public void setController(String controller) {
		this.controller = controller;
	}
	
	
	
}
